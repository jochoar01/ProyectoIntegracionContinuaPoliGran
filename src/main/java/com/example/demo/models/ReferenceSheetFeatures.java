package com.example.demo.models;

public class ReferenceSheetFeatures {

    public int longSize;
    public int shortSize;

    public ReferenceSheetFeatures(int heigh, int width) {
        this.longSize = heigh;
        this.shortSize = width;
    }

    public int getLongSize() {
        return longSize;
    }

    public int getShortSize() {
        return shortSize;
    }


}
