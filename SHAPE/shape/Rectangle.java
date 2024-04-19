package com.karakus.shape.shape;

import com.karakus.shape.Shape;

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
