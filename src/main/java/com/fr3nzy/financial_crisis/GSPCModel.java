package com.fr3nzy.financial_crisis;

import java.time.LocalDate;


public class GSPCModel {

    public GSPCModel(Long id, LocalDate date, Long close) {
        this.id = id;
        this.date = date;
        this.close = close;
    }

    public GSPCModel(Long id, LocalDate date, Long open, Long high, Long low, Long close, Long adj_close, Long volume) {
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
    private Long open;
    private Long high;
    private Long low;
    private Long close;
    private Long adj_close;
    private Long volume;

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

    public Long getOpen() {
        return open;
    }

    public void setOpen(Long open) {
        this.open = open;
    }

    public Long getHigh() {
        return high;
    }

    public void setHigh(Long high) {
        this.high = high;
    }

    public Long getLow() {
        return low;
    }

    public void setLow(Long low) {
        this.low = low;
    }

    public Long getClose() {
        return close;
    }

    public void setClose(Long close) {
        this.close = close;
    }

    public Long getAdj_close() {
        return adj_close;
    }

    public void setAdj_close(Long adj_close) {
        this.adj_close = adj_close;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }
}
