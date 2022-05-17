package com.patika.dev;

import java.util.Scanner;

public class CalculateFlight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, flightType;
        float total = 0.0F, totalBefore, roadAsKM, pricePerKM = 0.10F;

        System.out.println("Please enter your age :");
        age = input.nextInt();

        if (age < 0)
            System.out.println("Please enter valid value; age must be positive");
        else {
            System.out.println("Please enter the KM's of the road : ");
            roadAsKM = input.nextFloat();
            if (roadAsKM < 0)
                System.out.println("Please enter valid value; road must be positive");
            else {
                totalBefore = pricePerKM * roadAsKM;
                System.out.println("The price before the discounts :" + totalBefore);

                System.out.println("Please enter the type of your flight : 1 - One Way 2- Round Trip");
                flightType = input.nextInt();
                System.out.println(flightType + "" + age);
                if (flightType == 1 || flightType == 2) {
                    if (age < 12) {
                        total = totalBefore / 2;
                    } else if (age > 12 && age < 24) {
                        total = totalBefore * 90 / 100;
                    } else if (age > 65) {
                        total = totalBefore * 70 / 100;
                    }

                    if (flightType == 2) {
                        total = total * 80 / 100;
                    }
                    System.out.println("Total:" + total);
                } else {
                    System.out.println("Please enter valid value; choice must be 1 or 2");
                }

            }
        }
    }
}
