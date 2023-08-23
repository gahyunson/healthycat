package com.healthycounsel.healthycat.repository;


import com.healthycounsel.healthycat.dto.ChatRequest;
import com.healthycounsel.healthycat.dto.ChatResponse;

import java.util.List;

public interface ChatRepository {
    ChatRequest reqSave(ChatRequest request);
    ChatResponse resSave(ChatResponse response);
    List<ChatRequest> findReqAll();
    List<ChatResponse> findResAll();
}
