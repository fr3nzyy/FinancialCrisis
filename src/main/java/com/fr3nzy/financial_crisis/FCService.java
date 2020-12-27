package com.fr3nzy.financial_crisis;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FCService {
    private final FCRepository FCRepository;

    public FCService(FCRepository FCRepository) {
        this.FCRepository = FCRepository;
    }

    public List<GSPC> findAll() {
        return FCRepository.getEntitiesByLimit(10);
    }
}
