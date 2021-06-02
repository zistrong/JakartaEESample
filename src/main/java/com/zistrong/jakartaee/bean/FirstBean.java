package com.zistrong.jakartaee.bean;

import com.zistrong.jakartaee.service.FirstService;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@ViewScoped
@Named
public class FirstBean implements Serializable {



    private String value;

    private String name;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @PostConstruct
    public void init() {
    }

    @EJB
    FirstService firstService;

    public void show() {
        this.value = firstService.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
