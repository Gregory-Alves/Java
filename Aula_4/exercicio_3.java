package Aula_4;

import java.util.Scanner;

class exercicio_3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int vetor[] = {1, 2, 3, 4, 5};
        int y = 0;
    
        System.out.println("Qual numero voce que checar se existe no indice? ");
        int indice = input.nextInt();
        
        
        for(int i = 0; i < 5; i++) {
            
            if (vetor[i] == indice) {
                System.out.println("O numero consta no indice: " + i);
                y = 1;
            }
         }
         if(y==0){
             System.out.println("Elemento nao encontrado!");
         }
        input.close();
    }
}
