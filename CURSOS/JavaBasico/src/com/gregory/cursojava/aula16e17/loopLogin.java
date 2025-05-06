package com.gregory.cursojava.aula16e17;

import java.util.Scanner;

public class loopLogin {
    public static void main(String[] args) {
        String username = "gregory";
        String password = "123";
        boolean loggedin = false;

        while (loggedin == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Username: ");
            String usernameRecebido = scanner.next();
            System.out.print("Password: ");
            String passwordRecebido = scanner.next();

            if (!username.equals(usernameRecebido) || !password.equals(passwordRecebido)) {
                System.out.println("Dados incorretos");
            } else {
                System.out.println("Logged in");
                loggedin = true;
            }
        }
    }
}
