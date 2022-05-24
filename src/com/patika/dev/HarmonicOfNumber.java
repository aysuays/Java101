package com.patika.dev;

import java.util.Scanner;

public class HarmonicOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value :");
        int number = input.nextInt();
        double result = 0.0;
        for(double i=1; i<=number;i++)
            result += (1/i);

        System.out.println("Result " + result);

    }
}