package com.karakus.shape;

public class Circle implements Shape {
    private Double π ;
    private Double r ;

    public Circle(){

    }

    public Circle(Double r,Double π){
        this.π = π;

        this.r = r;
    }

    @Override
    public double calculateEnvironment() {
        return 2*π*r;
    }

    @Override
    public double calculateArea() {
        return  π*r*r;
    }
}
