package com.patika.dev;

import java.util.Scanner;

public class SuggestEventBasedWeather {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int heat;

        System.out.println("Please enter the temperature : ");
        heat = input.nextInt();

        if (heat < 5)
            System.out.println("You can ski");
        else if (heat > 5 && heat < 15)
            System.out.println("You can go to cinema");
        else if (heat > 15 && heat < 25)
            System.out.println("You can go to picnic");
        else if (heat > 25)
            System.out.println("You can swim");

    }
}