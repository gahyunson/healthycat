package com.healthycounsel.healthycat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatusCode;

import java.util.List;

@Data
@NoArgsConstructor
public class ChatResponse {
    private String assistant;

    public ChatResponse(String assistant) {
        this.assistant = assistant;
    }

}
