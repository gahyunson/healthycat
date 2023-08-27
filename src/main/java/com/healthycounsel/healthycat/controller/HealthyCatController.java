package com.healthycounsel.healthycat.controller;
import com.healthycounsel.healthycat.dto.ChatRequest;
import com.healthycounsel.healthycat.dto.ChatResponse;
import com.healthycounsel.healthycat.service.ChatService;
import com.healthycounsel.healthycat.service.ChatGptService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HealthyCatController {
//    private final ChatService chatService;
    private final ChatGptService chatGptService;

    public HealthyCatController(ChatGptService chatGptService) {
//        this.chatService = chatService;
        this.chatGptService = chatGptService;
    }

    @GetMapping("/counsel")
    public String counselChat() {
        return "counselChat";
    }

    @PostMapping("/counsel")
    public ResponseEntity<ChatResponse> chat(@RequestBody ChatRequest chatRequest) {
        System.out.println(chatRequest.getQuestion()+"????????????");

        ChatResponse chatResponse = new ChatResponse();
//        chatResponse.setAssistant(chatGptService.chatGPTService(chatRequest.getQuestion()));
        chatResponse.setAssistant("Hello, I'm GPT!");
        System.out.println(chatResponse);

//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Location","/counsel");
//        return new ResponseEntity<>(chatResponse, headers, HttpStatus.SEE_OTHER);

//        return ResponseEntity.ok(chatResponse);
        return ResponseEntity.status(HttpStatus.OK).body(chatResponse);
    }

}
