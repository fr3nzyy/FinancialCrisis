package com.fr3nzy.financial_crisis.controller;

import java.util.List;

public class CommonModelList1 {
    private String name;
    private List<CommonModel1> values;

    public CommonModelList1(String name, List<CommonModel1> values) {
        this.name = name;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CommonModel1> getValues() {
        return values;
    }

    public void setValues(List<CommonModel1> values) {
        this.values = values;
    }
}
