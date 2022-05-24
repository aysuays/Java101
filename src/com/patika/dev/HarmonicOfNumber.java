package com.patika.dev;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int result = 0 , digit;

        while (tempNumber != 0) {
            digit = tempNumber % 10 ;
            result += digit;
            tempNumber /= 10;
        }



        System.out.println("Result " +result);

    }
}