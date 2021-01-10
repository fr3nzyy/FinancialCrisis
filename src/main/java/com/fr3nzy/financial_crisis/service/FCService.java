package com.fr3nzy.financial_crisis.service;


import com.fr3nzy.financial_crisis.controller.GSPCLightModel;
import com.fr3nzy.financial_crisis.controller.GSPCModel;
import com.fr3nzy.financial_crisis.dao.FCRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FCService {
    private final FCRepository FCRepository;

    public FCService(FCRepository FCRepository) {
        this.FCRepository = FCRepository;
    }

    public List<GSPCModel> findAll() {
        return FCRepository.findAll().stream().
                map(it -> new GSPCModel(it.getId(), it.getDate().toLocalDate(), it.getClose())).collect(Collectors.toList());
    }

    public List<GSPCLightModel> getEntitiesByLimit() {
        return FCRepository.getEntitiesByLimit(30).stream().
                map(it -> new GSPCLightModel(it.getDate().toLocalDate(), it.getClose())).collect(Collectors.toList());
    }
}
