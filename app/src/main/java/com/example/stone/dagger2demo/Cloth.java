package com.example.stone.dagger2demo;

import javax.inject.Inject;

/**
 * Created by stone on 2017/6/27.
 */

public class Cloth {

    @Inject
    public Cloth(String color) {
        this.color = color;
    };

    private String color;

    public String getColor() {
        return  color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "布料";
    }
}
