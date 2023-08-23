package com.healthycounsel.healthycat.repository;
import com.healthycounsel.healthycat.dto.ChatRequest;
import com.healthycounsel.healthycat.dto.ChatResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryChatRepository implements ChatRepository{
    private static List<ChatRequest> reqStore = new ArrayList<>();
    private static List<ChatResponse> resStore = new ArrayList<>();

    @Override
    public ChatRequest reqSave(ChatRequest request) {
        reqStore.add(request);
        return request;
    }

    @Override
    public ChatResponse resSave(ChatResponse response) {
        resStore.add(response);
        return response;
    }

    @Override
    public List<ChatRequest> findReqAll() {
        return new ArrayList<>(reqStore);
    }

    @Override
    public List<ChatResponse> findResAll() {
        return new ArrayList<>(resStore);
    }

    public void clearStore() {
        reqStore.clear();
        resStore.clear();
    }
}
