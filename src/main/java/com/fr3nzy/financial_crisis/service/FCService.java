package com.fr3nzy.financial_crisis.service;


import com.fr3nzy.financial_crisis.controller.CommonModel;
import com.fr3nzy.financial_crisis.controller.FedFundsModel;
import com.fr3nzy.financial_crisis.controller.GSPCLightModel;
import com.fr3nzy.financial_crisis.controller.GSPCModel;
import com.fr3nzy.financial_crisis.dao.FedFundsRepository;
import com.fr3nzy.financial_crisis.dao.GSPCRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FCService {
    private final GSPCRepository gspcRepository;
    private final FedFundsRepository fedFundsRepository;

    public FCService(com.fr3nzy.financial_crisis.dao.GSPCRepository gspcRepository, FedFundsRepository fedFundsRepository) {
        this.gspcRepository = gspcRepository;
        this.fedFundsRepository = fedFundsRepository;
    }

    public List<GSPCModel> getAllGSPC() {
        return gspcRepository.findAll().stream().
                map(it -> new GSPCModel(it.getId(), it.getDate(), it.getClose())).collect(Collectors.toList());
    }

    public List<GSPCLightModel> getEntitiesByLimit() {
        return gspcRepository.getEntitiesByLimit(30).stream().
                map(it -> new GSPCLightModel(it.getDate(), it.getClose())).collect(Collectors.toList());
    }

    public List<FedFundsModel> findAllFedFunds() {
        return fedFundsRepository.findAll().stream().map(it -> new FedFundsModel(it.getDate(), it.getValue())).collect(Collectors.toList());
    }

    public List<CommonModel> getAllCommon() {
        List<CommonModel> models = gspcRepository.findAll().stream().map(
                it -> new CommonModel(it.getDate(), it.getClose())).collect(Collectors.toList());
        fedFundsRepository.findAll().forEach(it -> {
            models.stream().filter(model -> model.getDate().equals(it.getDate()))
                    .findFirst().ifPresent(opt -> opt.setFedFund(it.getValue() * 100));
        });
        return models;
    }
}
