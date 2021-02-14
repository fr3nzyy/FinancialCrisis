package com.fr3nzy.financial_crisis.controller;

import com.fr3nzy.financial_crisis.service.FCService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class FCController {

    private final FCService fcService;

    public FCController(FCService fcService) {
        this.fcService = fcService;
    }

    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GSPCModel>> findAllGSPC() {
        return new ResponseEntity<>(fcService.getAllGSPC(), HttpStatus.OK);
    }

    @GetMapping(value = "getLimit", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GSPCLightModel>> getEntitiesByLimit() {
        return new ResponseEntity<>(fcService.getEntitiesByLimit(), HttpStatus.OK);
    }

    @GetMapping(value = "getFedFunds", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<FedFundsModel>> findAllFedFunds() {
        return new ResponseEntity<>(fcService.findAllFedFunds(), HttpStatus.OK);
    }

    @GetMapping(value = "getCommon", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CommonModel>> getAllCommon() {
        return new ResponseEntity<>(fcService.getAllCommon(), HttpStatus.OK);
    }

    @GetMapping(value = "getCommon1", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CommonModelList1>> getAllCommon1() {
        return new ResponseEntity<>(fcService.getAllCommon1(), HttpStatus.OK);
    }
}
