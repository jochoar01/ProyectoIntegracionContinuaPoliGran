package com.example.demo.models;

public class Paths {

    private String initialPath;
    private String FinallPath;

    public Paths(String initialPath, String finallPath) {
        this.initialPath = initialPath;
        FinallPath = finallPath;
    }

    public String getInitialPath() {
        return initialPath;
    }

    public String getFinallPath() {
        return FinallPath;
    }
}
