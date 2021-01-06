package com.fr3nzy.financial_crisis;


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
        List<GSPCModel> entitiesByLimit = FCRepository.findAll().stream().
                map(it -> new GSPCModel(it.getId(), it.getDate().toLocalDate(), it.getClose())).collect(Collectors.toList());
        return entitiesByLimit;
    }

    public List<GSPCModel> getEntitiesByLimit() {
        List<GSPCModel> entitiesByLimit = FCRepository.getEntitiesByLimit(30).stream().
                map(it -> new GSPCModel(it.getId(), it.getDate().toLocalDate(), it.getClose())).collect(Collectors.toList());
        return entitiesByLimit;
    }
}
