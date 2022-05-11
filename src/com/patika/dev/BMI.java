package com.patika.dev;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float weight, height, BMI;

        System.out.println("Please enter the weight of your body as kilogram :");
        weight = input.nextFloat();

        System.out.println("Please enter the height of your body as metre:");
        height = input.nextFloat();

        BMI = weight / (height * height);

        System.out.println("Your BMI is :" + BMI);



    }
}