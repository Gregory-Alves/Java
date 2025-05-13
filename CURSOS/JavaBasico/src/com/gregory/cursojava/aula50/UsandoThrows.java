package com.gregory.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args) {

        System.out.println("Digite um numero decimal: ");
        try {
            double numero = leNumero();
            System.out.println("O numero digitado foi: " + numero);
        } catch (Exception e) {
            System.out.println("Entrada invalida");
            e.printStackTrace();
        }

    }

    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double numero = scan.nextDouble();
        return numero;
    }
}
