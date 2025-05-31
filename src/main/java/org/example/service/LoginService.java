package org.example.service;

import org.example.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Scanner;

public class LoginService {
    public void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        Session session = HibernateUtil.getSessionFactory().openSession();
        User user = session.createQuery("FROM User WHERE email = :email", User.class)
                .setParameter("email", email)
                .uniqueResult();
        session.close();

        if (user == null) {
            System.out.println("User not found.");
        } else if (!user.getPassword().equals(password)) {
            System.out.println("Incorrect password.");
        } else {
            System.out.println("Welcome, " + user.getFirstName() + " " + user.getLastName() + "!");
        }
    }
}
