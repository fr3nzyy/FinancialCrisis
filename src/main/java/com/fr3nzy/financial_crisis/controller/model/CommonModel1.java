package com.fr3nzy.financial_crisis.controller.model;

import java.time.LocalDate;

public class CommonModel1 {
    private LocalDate date;
    private double value;

    public CommonModel1(LocalDate date, double value) {
        this.date = date;
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
