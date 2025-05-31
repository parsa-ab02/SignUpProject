package org.example;

import org.example.service.LoginService;
import org.example.service.SignUpService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("[L]ogin, [S]ign up: ");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("l") || choice.equals("login")) {
            new LoginService().login();
        } else if (choice.equals("s") || choice.equals("sign up")) {
            new SignUpService().signUp();
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
