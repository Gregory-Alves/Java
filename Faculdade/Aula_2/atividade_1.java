package Aula_2;

import java.util.Scanner;

class atividade_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite o valor inteiro do primeiro numero:" );
        int num_1 = input.nextInt();
        
        System.out.print("Digite o valor inteiro do segundo numero: ");
        int num_2 = input.nextInt();
        
        if (num_1 > num_2) {
            System.out.print("Esses sao os numeros em ordem crescente: " + num_1 + ", " + num_2);
        }
        
        else {
            System.out.print("Esses sao os numeros em ordem crescente: " + num_2 + ", " + num_1);
        }
        input.close();
    }
}
