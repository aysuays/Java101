package com.patika.dev;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float area, circle, r, angleArea;
        int angle;
        final float PI= 3.14F;

        System.out.println("Please enter r of the circle :");
        r= input.nextFloat();

        area = PI*r*r;
        circle = 2*PI*r;

        System.out.println("Area :"+area + "\nCircle :"+circle);

        System.out.println("Please enter the angle of circle:");
        angle=input.nextInt();
        angleArea= (PI*(r*r)*angle)/360;
        System.out.println("the area of a slice of circle with radius r and center angle :"+ angleArea);




    }
}