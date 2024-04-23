package Aula_1;

import java.util.Scanner;

class atividade_3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantas latas de 350ml voce quer? ");
        float lata = input.nextInt();
        float total_lata = (35.0f/100) * lata;
        
        System.out.print("Quantas garrafas de 600ml voce quer? ");
        int gar_600 = input.nextInt();
        float total_600 = gar_600 * (60.0f/100);
  
        System.out.print("Quantas garrafas de 2L voce quer?  ");
        int gar_2l = input.nextInt();
        float total_2l = gar_2l * 2;
        
        float total_litros = total_lata + total_600 + total_2l;
    
        System.out.println("Essa e a quantidade total em LITROS: " + total_litros);
    
        input.close();
    }
}
