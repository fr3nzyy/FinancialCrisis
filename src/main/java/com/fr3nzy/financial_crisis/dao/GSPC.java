package com.fr3nzy.financial_crisis.dao;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class GSPC {
    @Id
    private Long id;
    private LocalDateTime date;
    private Long open;
    private Long high;
    private Long low;
    private Long close;
    private Long adj_close;
    private Long volume;

    public Long getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Long getOpen() {
        return open;
    }

    public Long getHigh() {
        return high;
    }

    public Long getLow() {
        return low;
    }

    public Long getClose() {
        return close;
    }

    public Long getAdj_close() {
        return adj_close;
    }

    public Long getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GSPC gspc = (GSPC) o;

        return id.equals(gspc.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
