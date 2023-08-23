//package com.healthycounsel.healthycat.controller;
//
//import com.healthycounsel.healthycat.dto.ChatRequest;
//import com.healthycounsel.healthycat.dto.ChatResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//@RestController
//@RequestMapping("/bot")
//public class CustomBotController {
//
//    @Value("${openai.model}")
//    private String model;
//
//    @Value(("${openai.api.url}"))
//    private String apiURL;
//
//    @Autowired
//    private RestTemplate template;
//
//
//    @GetMapping("/chat")
//    public String chat(@RequestParam("prompt") String prompt){
//        ChatRequest request = new ChatRequest(prompt);
//        ChatResponse chatResponse = template.postForObject(apiURL, request, ChatResponse.class);
//        return String.valueOf(chatResponse.getAssistant());
//    }
//}
