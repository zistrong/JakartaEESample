package com.zistrong.jakartaee.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
public class Production implements Serializable {
    @Id
    private Long id;

    @NotNull
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
