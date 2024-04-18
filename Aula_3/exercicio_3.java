package Aula_3;

import java.util.Scanner;
class exercicio3 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
          
         System.out.print("Digite ate qual numero voce quer saber quais sao pares:" );
        int pares = input.nextInt();
        
        int cont=0;
        
        for(int num = 2; num <= pares; num+=2){
             System.out.println(num);
             cont++;
        }
        System.out.println("Essa e a quantidade de numeros pares: " + cont);
         
    input.close();
    }
}