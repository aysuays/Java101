package com.patika.dev;

import java.util.Scanner;

public class AddUntilOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int valuee, total = 0, counter = 0;
        float avg;


        System.out.println("Please enter an positive integer :");
        valuee = input.nextInt();

        while ( valuee %2 == 0 ){
            total += valuee;
            System.out.println("Please enter an positive integer :");
            valuee = input.nextInt();
        }
        System.out.println("Total:" + total);





    }
}