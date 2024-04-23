package Aula_3;

import java.util.Scanner;
class exercicio_5 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
          
         System.out.print("Digite qual numero voce quer ver a tabuada: " );
         int num = input.nextInt();
         int mult = 0;
        for(int x = 0; x <=10; x++){
         mult= num * x;
         System.out.println(num + " * " + x + " = " + mult);   
        }
     input.close();
    }
}