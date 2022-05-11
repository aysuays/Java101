package com.patika.dev;
import java.util.Scanner;

public class VatCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vatAmount= 0.0F;
        float vatTotal=0.0F;

        System.out.println("Please enter price of the product :");
        float price =input.nextFloat();
        if(price<=1000)
        {
        vatAmount = price * 18/100;
        }
        else if (price>1000) {
        vatAmount = price * 8/100 ;
        }
        vatTotal = vatAmount + price ;

        System.out.println("Your final price with VAT included :"+ vatTotal);

    }
}
