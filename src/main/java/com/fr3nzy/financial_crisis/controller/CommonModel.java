package com.fr3nzy.financial_crisis.controller;

import java.time.LocalDate;

public class CommonModel {
    private LocalDate date;
    private Double GSPCClose;
    private double FedFund;

    public CommonModel(LocalDate date, Double GSPCClose, Double fedFund) {
        this.date = date;
        this.GSPCClose = GSPCClose;
        FedFund = fedFund;
    }

    public CommonModel(LocalDate date, Double GSPCClose) {
        this.date = date;
        this.GSPCClose = GSPCClose;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getGSPCClose() {
        return GSPCClose;
    }

    public void setGSPCClose(Double GSPCClose) {
        this.GSPCClose = GSPCClose;
    }

    public Double getFedFund() {
        return FedFund;
    }

    public void setFedFund(Double fedFund) {
        FedFund = fedFund;
    }
}
