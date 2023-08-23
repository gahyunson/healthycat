package com.healthycounsel.healthycat.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.theokanning.openai.client.OpenAiApi;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;

import java.time.Duration;
import java.util.List;

import static com.theokanning.openai.service.OpenAiService.*;

@Service
public class ChatGptService {

    @Value("${openai.api.key}")
    String openaiApiKey;
    @Value("${openai.api.url}")
    String openaiUrl;
    @Value("${openai.model}")
    String openaiModel;
    @Value("${openai.api.default.timeout}")
    String timeout;
    @Value("${openai.api.max_tokens}")
    String token;

    public String chatGPTService(String prompt){
        ObjectMapper mapper = defaultObjectMapper();
        OkHttpClient client = defaultClient(token, Duration.ofSeconds(60))
                .newBuilder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
        Retrofit retrofit = defaultRetrofit(client, mapper);

        OpenAiApi api = retrofit.create(OpenAiApi.class);
        OpenAiService service = new OpenAiService(api);
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(prompt)
                .model(openaiModel)
                .echo(true)
                .build();

        return service.createCompletion(completionRequest).getChoices().get(0).getText();
    }
}
