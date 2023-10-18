package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

public class dtoClass {

    @Getter @Setter
    private int width;

    @Getter @Setter
    private int height;

    @Getter @Setter
    private int vertical;

    @Getter @Setter
    private int xChuk;

    @Getter @Setter
    private int yChuk;

    @Getter @Setter
    private int zChuk;
    
    @Override
    public String toString() {
        return "dtoClass{" +
                "width=" + width +
                ", height=" + height +
                ", vertical=" + vertical +
                ", xChuk=" + xChuk +
                ", yChuk=" + yChuk +
                ", zChuk=" + zChuk +
                '}';
    }
    
}