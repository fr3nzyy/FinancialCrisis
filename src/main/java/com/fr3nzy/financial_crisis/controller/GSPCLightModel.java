package com.fr3nzy.financial_crisis.controller;

import java.time.LocalDate;

public class GSPCLightModel {
    private LocalDate date;
    private Long close;

    public GSPCLightModel(LocalDate date, Long close) {
        this.date = date;
        this.close = close;
    }

    public GSPCLightModel() {
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setClose(Long close) {
        this.close = close;
    }

    public LocalDate getDate() {
        return date;
    }

    public Long getClose() {
        return close;
    }
}
