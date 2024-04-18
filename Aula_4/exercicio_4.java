package Aula_4;

import java.util.Scanner;

class exercicio_4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       int vetor[][] = new int[2][3];
       int soma=0;
       for(int x=0; x<2; x++){
           for(int y=0; y<3; y++){
               System.out.printf("Informe elemento [%d][%d]: ",x,y);
               vetor[x][y] = input.nextInt();
              soma = soma + vetor[x][y]; 
           }
       }
       
       System.out.printf("Essa e a soma de todas os numeros da matriz: "+ soma);
       input.close();
    }
}
