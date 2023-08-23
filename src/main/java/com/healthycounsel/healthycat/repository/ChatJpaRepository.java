package com.healthycounsel.healthycat.repository;

import com.healthycounsel.healthycat.dto.ChatRequest;
import com.healthycounsel.healthycat.dto.ChatResponse;
import jakarta.persistence.EntityManager;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class ChatJpaRepository implements ChatRepository {
    private final EntityManager em;

    public ChatJpaRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public ChatRequest reqSave(ChatRequest request) {
        em.persist(request);
        return request;
    }

    @Override
    public ChatResponse resSave(ChatResponse response) {
        em.persist(response);
        return response;
    }

    @Override
    public List<ChatRequest> findReqAll() {
        return em.createQuery("select req from ChatRequest req", ChatRequest.class).getResultList();
    }

    @Override
    public List<ChatResponse> findResAll() {
        return em.createQuery("select res from ChatResponse res", ChatResponse.class).getResultList();
    }
}
