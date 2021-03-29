package com.fr3nzy.financial_crisis.controller.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;


public class CommonModel {
    private LocalDate date;
    private Double GSPCClose;
    private Double FedFund;
    private Double cpi;

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

    public Double getCpi() {
        return cpi;
    }

    public void setCpi(Double cpi) {
        this.cpi = cpi;
    }

}
