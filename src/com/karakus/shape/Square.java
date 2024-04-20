package com.karakus.shape;

public class Square implements Shape {
    private int akenari;
    public Square(){

    }

    public Square(int akenari){
        this.akenari = akenari;
    }
    @Override
    public double calculateEnvironment() {
        return 4*akenari;
    }

    @Override
    public double calculateArea() {
        return akenari*akenari;
    }
}
