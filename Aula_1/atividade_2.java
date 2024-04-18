package Aula_1;

import java.util.Scanner;

class atividade_2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Qual o numero? ");
        int num = input.nextInt();
        
        int num_ant = num - 1;
        
        int num_suc = num + 1;
        
        System.out.println("Esse e o numero anterior: " + num_ant);
        
        System.out.println("Esse e o numero sucessor: " + num_suc);
        
        input.close();
    }
}
