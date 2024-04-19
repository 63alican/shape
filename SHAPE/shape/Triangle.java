package com.karakus.shape.shape;

import com.karakus.shape.Shape;

public class Triangle implements Shape {

    private String sekilName;
    private double aKenar;
    //private  Double aKenar;
    private double bKenar;
    //private Double bKenar;
    private double cKenar;



     public Triangle(String name,double a,double b,double c){
         this.sekilName = name;
         this.aKenar = a;
         this.bKenar = b;
         this.cKenar = c;
     }
    @Override
    public double calculateEnvironment() {
        return aKenar+bKenar+cKenar;
    }

    public double getaKenar() {
        return aKenar;
    }

    public void setaKenar(double aKenar) {
        this.aKenar = aKenar;
    }

    public double getbKenar() {
        return bKenar;
    }

    public void setbKenar(double bKenar) {
        this.bKenar = bKenar;
    }

    public double getcKenar() {
        return cKenar;
    }

    public void setcKenar(double cKenar) {
        this.cKenar = cKenar;
    }

    @Override
    public double calculateArea() {
        double u = (aKenar+bKenar+cKenar)/2;
        double alan = Math.sqrt(u*(u-aKenar)*(u-bKenar)*(u-cKenar));
        return alan;
    }

    public String getSekilName() {
        return sekilName;
    }

    public void setSekilName(String sekilName) {
        this.sekilName = sekilName;
    }
}
