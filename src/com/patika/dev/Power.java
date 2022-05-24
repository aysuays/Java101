package com.patika.dev;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int value1, base1, result1 = 1;

        System.out.println("Please enter a value  :");
        value1 = input.nextInt();

        System.out.println("Please enter a base  :");
        base1 = input.nextInt();

        for(int i = 1; i<= base1; i++){
            result1 *= value1;
        }

        System.out.println("Result is:" + result1);


    }

}
