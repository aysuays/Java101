package com.patika.dev;

import java.util.Scanner;

public class GroceryCheckout {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final float pear = 2.14F;
        final float apple = 3.67F;
        final float tomato = 1.11F;
        final float bananas = 0.95F;
        final float aubergine = 5.0F;
        float pearKg, appleKg, tomatoKg, bananasKg, aubergineKg, totalPrice;

        System.out.println("how many kilos of pears did you buy from grocery?");
        pearKg = input.nextFloat();

        System.out.println("how many kilos of apples did you buy from grocery?");
        appleKg = input.nextFloat();

        System.out.println("how many kilos of tomatoes did you buy from grocery?");
        tomatoKg = input.nextFloat();

        System.out.println("how many kilos of bananas did you buy from grocery?");
        bananasKg = input.nextFloat();

        System.out.println("how many kilos of aubergines did you buy from grocery?");
        aubergineKg = input.nextFloat();

        totalPrice=(pear*pearKg)+(apple*appleKg)+(tomato*tomatoKg)+(bananas*bananasKg)+(aubergine*aubergineKg);
        System.out.println("Total price that you should pay to grocery:\t" +totalPrice);


    }
}
