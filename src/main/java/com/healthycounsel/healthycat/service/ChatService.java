package com.healthycounsel.healthycat.service;

import com.healthycounsel.healthycat.dto.ChatRequest;
import com.healthycounsel.healthycat.dto.ChatResponse;
import com.healthycounsel.healthycat.repository.ChatRepository;

import java.util.List;

public class ChatService {
    private final ChatRepository chatRepository;
    private final ChatGptService chatGPTService;

    public ChatService(ChatRepository chatRepository, ChatGptService chatGPTService) {
        this.chatRepository = chatRepository;
        this.chatGPTService = chatGPTService;
    }

    public String reqSave(ChatRequest chatRequest){
        chatRepository.reqSave(chatRequest);
        return chatRequest.getQuestion();
    }

//    public String resSave(ChatRequest chatRequest){
//        String res = chatGPTService.chatGPTService(chatRequest);
//        chatRepository.resSave(res);
//        return req;
//    }
    public List<ChatRequest> findReq(){
        return chatRepository.findReqAll();
    }
    public List<ChatResponse> findRes(){
        return chatRepository.findResAll();
    }

}
