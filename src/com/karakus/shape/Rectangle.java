package com.karakus.shape;

public class Rectangle implements Shape {

    private double aKenar; //Field
    private double bKenar; //Field


    public Rectangle(){

    }

    public Rectangle(double a,double b){
        this.aKenar = a;
        this.bKenar = b;
    }

    @Override
    public double calculateEnvironment() { //Method

        return 2*(aKenar+bKenar);
    }

    @Override
    public double calculateArea() {
        return aKenar*bKenar;
    }
}
