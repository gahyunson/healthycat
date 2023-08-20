package com.healthycounsel.healthycat.controller;
import com.healthycounsel.healthycat.dto.ChatRequest;
import com.healthycounsel.healthycat.dto.ChatResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;

@Controller
public class HealthyCatController {


    @GetMapping("/counsel")
    public String counselChat() {
        return "counselChat";
    }

    @PostMapping("/counsel")
    public ResponseEntity<ChatResponse> chat(ChatRequest chatRequest) {
        ChatResponse chatResponse = new ChatResponse();
        chatResponse.setAssistant("1st answer");
        System.out.println(chatRequest.getQuestion());
        System.out.println(chatResponse.getAssistant());

        return ResponseEntity.ok(chatResponse);
//        HttpHeaders header = new HttpHeaders();
//        header.setContentType(new MediaType("application","json", Charset.forName("UTF-8")));

//        return new ResponseEntity<>(chatResponse,header,HttpStatus.OK);

    }

}
