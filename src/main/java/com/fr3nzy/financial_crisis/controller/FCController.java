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
    public ResponseEntity<List<GSPCModel>> findAll() {
        return new ResponseEntity<>(fcService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "getLimit", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GSPCLightModel>> getEntitiesByLimit() {
        return new ResponseEntity<>(fcService.getEntitiesByLimit(), HttpStatus.OK);
    }
}