package org.example;

import java.util.Scanner;
public class Signup {
    public static void signupMenu(Scanner input) {
        System.out.println("First Name: ");
        String firstName = input.nextLine().trim();

        System.out.println("Last Name: ");
        String lastName = input.nextLine().trim();

        System.out.println("Age: ");
        int age = Integer.parseInt(input.nextLine().trim());

        System.out.println("Email: ");
        String email = input.nextLine().trim();

        System.out.println("Password: ");
        String password = input.nextLine().trim();
        input.close();
    }
}
