package com.gregory.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();//Para ler a proxima linha
        System.out.println("Your full name is: " + fullName + ".");

        System.out.println("Enter your name: ");
        String name = scan.next();//Para ler a proxima palavra
        System.out.println("Your name is: " + name + ".");

        System.out.println("Enter your age: ");
        int age = scan.nextInt();//Para ler um numero inteiro.
        System.out.println("Your age is: " + age + ".");
    }
}
