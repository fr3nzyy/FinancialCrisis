package com.fr3nzy.financial_crisis.controller.model;

import java.time.LocalDate;

public class GSPCLightModel {
    private LocalDate date;
    private Double close;

    public GSPCLightModel(LocalDate date, Double close) {
        this.date = date;
        this.close = close;
    }

    public GSPCLightModel() {
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getClose() {
        return close;
    }
}
