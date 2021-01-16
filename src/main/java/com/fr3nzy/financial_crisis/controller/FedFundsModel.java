package com.fr3nzy.financial_crisis.controller;

import java.time.LocalDate;

public class FedFundsModel {
    private LocalDate date;
    private Double value;

    public FedFundsModel(LocalDate date, Double value) {
        this.date = date;
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
