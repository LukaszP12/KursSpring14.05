package com.clockwork.kursspring.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Quest {

    private String description;

    public Quest(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }


}
