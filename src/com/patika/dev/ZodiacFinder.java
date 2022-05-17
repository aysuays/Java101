package com.patika.dev;

import java.util.Date;
import java.util.Scanner;

public class ZodiacFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayz, month;

        System.out.println("Please Enter your birth month");
        month = input.nextInt();

        System.out.println("Please Enter the day you were born");
        dayz = input.nextInt();

        if (month == 1) {
            if (dayz < 22)
                System.out.println("Capricorn");
            else
                System.out.println("Aquarius");
        }
        else if (month == 2) {
            if (dayz < 20)
                System.out.println("Aquarius");
            else
                System.out.println("Pisces");
        }
        else if (month == 3) {
            if (dayz < 21)
                System.out.println("Pisces");
            else
                System.out.println("Aries");
        }
        else if (month == 4) {
            if (dayz < 21)
                System.out.println("Aries");
            else
                System.out.println("Taurus");
        }
        else if (month == 5) {
            if (dayz < 22)
                System.out.println("Taurus");
            else
                System.out.println("Gemini");
        }
        else if (month == 6) {
            if (dayz < 23)
                System.out.println("Gemini");
            else
                System.out.println("Cancer");
        }
        else if (month == 7) {
            if (dayz < 23)
                System.out.println("Cancer");
            else
                System.out.println("Leo");
        }
        else if (month == 8) {
            if (dayz < 23)
                System.out.println("Leo");
            else
                System.out.println("Virgo");
        }
        else if (month == 9) {
            if (dayz < 23)
                System.out.println("Virgo");
            else
                System.out.println("Libra");
        }
        else if (month == 10) {
            if (dayz < 23)
                System.out.println("Libra");
            else
                System.out.println("Scorpio");
        }
        else if (month == 11) {
            if (dayz < 23)
                System.out.println("Scorpio");
            else
                System.out.println("Sagittarius");
        }
        else if (month == 12) {
            if (dayz < 23)
                System.out.println("Sagittarius");
            else
                System.out.println("Capricorn");
        }

    }
}
