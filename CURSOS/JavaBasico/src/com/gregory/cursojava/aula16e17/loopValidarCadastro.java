package com.gregory.cursojava.aula16e17;

import java.util.Scanner;

public class loopValidarCadastro {
    public static void main(String[] args) {

        boolean cadastroValidado = false;
        String nome;
        int idade;
        float salario;
        char sexo;
        char estadoCivil;
        boolean etapa = false;

        while (cadastroValidado == false) {
             while (etapa == false) {
                 System.out.println("Digite seu nome: (MAIOR QUE 3 CARACTERES))");
                 nome = new Scanner(System.in).nextLine();
                 if (nome.length() <= 3) {
                     System.out.println("Seu nome deve ser maior que 3 caracteres");
                 }
                 else if (nome.length() > 3) {
                     cadastroValidado = etapa = true;
                 }
             }
             etapa = false;

             while (etapa == false) {
                 System.out.println("Digite sua idade: ");
                 idade = new Scanner(System.in).nextInt();
                 if (idade >= 0 && idade <= 150) {
                     etapa = true;
                 }
                 else {
                     System.out.println("Sua idade deve estar entre 0 e 150 ");
                 }
             }
             etapa = false;
             while (etapa == false) {
                 System.out.println("Digite seu salario: ");
                 salario = new Scanner(System.in).nextFloat();
                 if (salario > 0) {
                     etapa = true;
                 }
                 else {
                     System.out.println("Sua salario deve ser maior que 0");
                 }
             }
             etapa = false;
             while (etapa == false) {
                 System.out.println("Digite seu sexo: ");
                 sexo = new Scanner(System.in).next().charAt(0);
                 if (sexo == 'm' || sexo == 'M' || sexo == 'f' || sexo == 'F') {
                     etapa = true;
                 }
                 else {
                     System.out.println("Sua sexo deve ser M ou F");
                 }
             }
             etapa = false;
             while (etapa == false) {
                 System.out.println("Digite seu estado civil: ");
                 estadoCivil = new Scanner(System.in).next().charAt(0);
                 if (estadoCivil == 's' || estadoCivil == 'S' || estadoCivil == 'c' || estadoCivil == 'C' || estadoCivil
                         == 'v' || estadoCivil == 'V' || estadoCivil == 'd' || estadoCivil == 'D' ) {
                     etapa = true;
                 }
                 else {
                     System.out.println("Sua estado civil deve ser S , C, V ou D");
                 }
             }
             cadastroValidado = true;
        }
    }
}
