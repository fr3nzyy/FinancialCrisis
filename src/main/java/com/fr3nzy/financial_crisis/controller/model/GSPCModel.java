package com.fr3nzy.financial_crisis.controller.model;

import java.time.LocalDate;


public class GSPCModel {

    public GSPCModel(Long id, LocalDate date, Double close) {
        this.id = id;
        this.date = date;
        this.close = close;
    }

    public GSPCModel(Long id, LocalDate date, Double open, Double high, Double low, Double close, Double adj_close, Double volume) {
        this.id = id;
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.adj_close = adj_close;
        this.volume = volume;
    }

    public GSPCModel() {
    }

    private Long id;
    private LocalDate date;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Double adj_close;
    private Double volume;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Double getAdj_close() {
        return adj_close;
    }

    public void setAdj_close(Double adj_close) {
        this.adj_close = adj_close;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
