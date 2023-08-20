package com.healthycounsel.healthycat.dto;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class ChatRequest {
    private String question;

    @Override
    public String toString() {
        return "ChatRequest{" +
                "question='" + question + '\'' +
                '}';
    }
}

