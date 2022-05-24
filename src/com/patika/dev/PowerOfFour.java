package com.patika.dev;

import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int valuee ;
        float avg;


        System.out.println("Please enter an positive integer :");
        valuee = input.nextInt();

        for(int i=1; i < valuee; i*=4) {
            System.out.println("Power of 4 :" +valuee );
            System.out.println(i);
        }

        for(int i=1; i < valuee; i*=5) {
            System.out.println("Power of 5 :" +valuee );

        }
    }
}