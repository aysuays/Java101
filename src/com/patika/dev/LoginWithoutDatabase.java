package com.patika.dev;

import java.util.Scanner;

public class LoginWithoutDatabase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username, password, newPassword;
        int isReset;

        System.out.println("Please enter your username : ");
        username = input.nextLine();

        System.out.println("Please enter your username : ");
        password = input.nextLine();

        if (username.equals("user") && password.equals("password")) {
            System.out.println("Successfull Login");
        }
        else {
            System.out.println("Login Failed. If you want reset your password please enter (1) , otherwise (2)");
            isReset = input.nextInt();
            if (isReset == 1) {
                System.out.println("Please enter new password :");
                input.nextLine();
                newPassword = input.nextLine();
                if (newPassword != password)
                    System.out.println("Password has been set.");
                else
                    System.out.println("Can't be the same with old password.");
            }
            else
                System.out.println("Bye Bye");
        }

    }
}