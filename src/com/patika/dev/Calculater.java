package com.patika.dev;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int value1, value2, choice;
        float result = 0.0F;


        System.out.println("Please enter the first value to calculate : ");
        value1 = input.nextInt();
        System.out.println("Please enter the second value to calculate : ");
        value2 = input.nextInt();
        System.out.println("Please enter the value of what arithmetic operation you want, for Addition enter (1), subtraction (2) , Multiplication (3), Division (4) : ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                result = value1 + value2;
                break;
            case 2:
                result = value1 - value2;
                break;
            case 3:
                result = value1 * value2;
                break;
            case 4:
                if (value2 != 0)
                    result = value1 / value2;
                else
                    System.out.println("Can't divide 0");
                break;
            default:
                System.out.println("You made your choice wrong. Please try again.");
                break;
        }
        System.out.println("Result is :" + result);
    }
}