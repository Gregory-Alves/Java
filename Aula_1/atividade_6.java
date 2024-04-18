package Aula_1;

import java.util.Scanner;

class atividade_6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos valor voce quer sacar? (Notas disponiveis: 5,10,20,50 e 100) ");
        int valor = input.nextInt();
        
        int quant_100 = valor/100;
        valor %= 100;
        
        int quant_50 = valor/50;
        valor %= 50;
        
        int quant_20 = valor/20;
        valor %= 20;
        
        int quant_10 = valor/10;
        valor %= 10;
        
        int quant_5 = valor/5;
        valor %= 5;
        
        System.out.println("Quantidade de notas: ");
        System.out.println("Quantidade de notas de 100 reais: " + quant_100);
        System.out.println("Quantidade de notas de 50 reais: " + quant_50);
        System.out.println("Quantidade de notas de 20 reais: " + quant_20);
        System.out.println("Quantidade de notas de 10 reais: " + quant_10);
        System.out.println("Quantidade de notas de 5 reais: " + quant_5);
        
        input.close();
    }
}
