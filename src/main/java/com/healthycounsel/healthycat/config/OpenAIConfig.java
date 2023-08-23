//package com.healthycounsel.healthycat.config;
//
//import com.healthycounsel.healthycat.dto.ChatRequest;
//import com.healthycounsel.healthycat.dto.ChatResponse;
//import com.healthycounsel.healthycat.repository.ChatRepository;
//import com.healthycounsel.healthycat.repository.MemoryChatRepository;
//import com.healthycounsel.healthycat.service.ChatService;
//import com.theokanning.openai.completion.CompletionRequest;
//import com.theokanning.openai.completion.chat.ChatFunction;
//import com.theokanning.openai.completion.chat.ChatFunctionCall;
//import com.theokanning.openai.completion.chat.ChatMessage;
//import com.theokanning.openai.service.FunctionExecutor;
//import com.theokanning.openai.service.OpenAiService;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Collections;
//
//@Configuration
//public class OpenAIConfig {
//
//    @Value("${openai.api.key}")
//    String openaiApiKey;
//    @Value("${openai.api.url}")
//    String openaiUrl;
//    @Value("${openai.model}")
//    String openaiModel;
//
//    @Bean
//    public String cptResponse(){
//        OpenAiService service = new OpenAiService(openaiApiKey);
//        CompletionRequest completionRequest = CompletionRequest.builder()
//                .prompt("Somebody once told me the world is gonna roll me")
//                .model("ada")
//                .echo(true)
//                .build();
//        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
//
//        ChatMessage responseMessage = service.createChatCompletion(chatCompletionRequest).getChoices().get(0).getMessage();
//        ChatFunctionCall functionCall = responseMessage.getFunctionCall(); // might be null, but in this case it is certainly a call to our 'get_weather' function.
//
//        ChatMessage functionResponseMessage = functionExecutor.executeAndConvertToMessageHandlingExceptions(functionCall);
//        messages.add(response);
//    }
//
////    @Bean
////    publc String makeResponse(){
////        FunctionExecutor functionExecutor = new FunctionExecutor(Collections.singletonList(ChatFunction.builder()
////                .name("get_weather")
////                .description("Get the current weather of a location")
////                .build()));
////    }
////
////    @Bean
////    public RestTemplate template(){
////        RestTemplate restTemplate=new RestTemplate();
////        restTemplate.getInterceptors().add((request, body, execution) -> {
////            request.getHeaders().add("Authorization", "Bearer " + openaiApiKey);
////            return execution.execute(request, body);
////        });
////        return restTemplate;
////    }
//
////    @Bean
////    public ChatService chatService(){
////        return new ChatService(chatRepository());
////    }
////    @Bean
////    public ChatRepository chatRepository(){
////        return new MemoryChatRepository();
////    }
//}
