package com.healthycounsel.healthycat.service;

import org.junit.jupiter.api.Test;

public class ChatCptServiceTest {
    ChatGptService chatGptService;

    @Test
    public void GptResponse(){
        chatGptService.chatGPTService("hello");
    }
}
