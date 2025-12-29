package com.sohojbd.busticketbooking;

import java.util.Scanner;

public class LoginController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sample registered users (for testing)
        String[] username = {"Admin", "Alif", "Farah"};
        String[] password = {"1234", "166", "200"};

        System.out.println("--- Shohoj.bd E-Bus Login ---");

        System.out.print("Enter Username: ");
        String inputUser = sc.nextLine();

        System.out.print("Enter Password: ");
        String inputPass = sc.nextLine();

        boolean loginSuccess = false;

        for (int i = 0; i < username.length; i++) {
            if (inputUser.equals(username[i]) && inputPass.equals(password[i])) {
                loginSuccess = true;
                break;

            }
            if (loginSuccess) {
                System.out.println(" Login Successful!");
            } else {
                System.out.println(" Invalid Username or Password!");
            }

            sc.close();
        }

        }














}
