package com.example.demo.dto;

public class dtoClass {
    private int width;
    private int height;    
    private int vertical;
    private int xChuk;
    private int yChuk;
    private int zChuk;

    // (Getter 및 Setter 메서드) test

    // @Override
    // public String toString() {
    //     return "dtoClass{" +
    //             "width=" + width +
    //             ", height=" + height +
    //             ", vertical=" + vertical +
    //             ", xChuk=" + xChuk +
    //             ", yChuk=" + yChuk +
    //             ", zChuk=" + zChuk +
    //             '}';
    // }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public int getxChuk() {
        return xChuk;
    }

    public void setxChuk(int xChuk) {
        this.xChuk = xChuk;
    }

    public int getyChuk() {
        return yChuk;
    }

    public void setyChuk(int yChuk) {
        this.yChuk = yChuk;
    }

    public int getzChuk() {
        return zChuk;
    }

    public void setzChuk(int zChuk) {
        this.zChuk = zChuk;
    }
}