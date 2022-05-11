package com.patika.dev;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int openPrice = 10;
        int minPrice = 20;
        float pricePerKm = 2.2F;
        float distance = 0.0F;
        float totalPrice;

        System.out.println("Please enter the distance traveled:");
        distance=input.nextFloat();

        totalPrice= openPrice+(pricePerKm*distance);

        if(totalPrice<20)
            totalPrice=20;

        System.out.println("Total price of taxi:" +totalPrice);



    }

}
