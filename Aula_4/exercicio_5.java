package Aula_4;

import java.util.Scanner;

class exercicio_5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       int vetor[][] = new int[5][5];
       int soma=0;
       for(int x=0; x<5; x++){
           for(int y=0; y<5; y++){
               System.out.printf("Informe elemento [%d][%d]: ",x,y);
               vetor[x][y] = input.nextInt();
            if (x==2){
              soma = soma + vetor[x][y]; }
           }
       }
       System.out.printf("Essa e a soma de todas os numeros da terceira linha da matriz: "+ soma);
       input.close();
    }
}
