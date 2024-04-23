package Aula_1;

import java.util.Scanner;

class atividade_4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos dias voce ficou com o carro? ");
        int dias = input.nextInt();
        float total_dias = dias * 75f;
        
        System.out.print("Quantos KMs voce rodou com o carro? ");
        float km = input.nextFloat();
        float total_km = km * 0.15f;
        
        float total = total_dias + total_km;
        
        System.out.print("Esse e o total a se pagar: R$" + total);
        
        input.close();
    }
}
