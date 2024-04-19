package com.karakus.shape;

import com.karakus.shape.shape.Rectangle;
import com.karakus.shape.Shape.Circle;
import com.karakus.shape.shape.Square;
import com.karakus.shape.shape.Triangle;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(10,12);
        Square a = new Square(5);
        int a1alan = (int) a.calculateArea();
        int a1çevre = (int) a.calculateEnvironment();

        double r2Alan = r2.calculateArea();
        System.out.println("karenin alanı :" +a1alan);
        System.out.println("karenin çevresi :" +a1çevre);
        System.out.println("Dikdörtgen 2'nın alanı : "+r2Alan);

        Triangle t1 = new Triangle("t1",6,6,6);
        System.out.println("Ucgen t1 alanı : "+t1.calculateArea()+" benim adım :"+t1.getSekilName());

        Shape  s1 = new Triangle("s111",6,6,6);
        System.out.println("Ucgen s1 alanı : "+s1.calculateArea()+" benim adım : ");

        Shape s2 = new Rectangle(5,6);
        System.out.println("Dikdortgen alan s2 "+s2.calculateArea());
    }

}
