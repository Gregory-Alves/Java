package com.gregory.cursojava.aula16e17;

import java.util.Scanner;

public class loopNumeroValido {
    /*Vamos fazer um looping que peca um numero de 1 a 10, informe se for invalido e peca ate o numero ser valido"*/
        public static void main(String[] args) {
            boolean valido = true;
            while(valido == true){
                Scanner scan = new Scanner (System.in);
                System.out.println("Digite um numero de um a 10: ");
                int num = scan.nextInt();
                if(num <=10){
                    System.out.println("Voce digitou um numero correto!");
                    valido = false;
                }
                else{
                    System.out.println("Voce digitou um numero maior que 10!");
                }
            }
        }
    }
