package Aula_4;

import java.util.Scanner;

class exercicio_6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       int vetor[][] = new int[5][5];
       int soma=0;
       int cont=0;
       int maior=0;
       int menor=0;
       int media=0;
       for(int x=0; x<5; x++){
           for(int y=0; y<5; y++){
               System.out.printf("Informe elemento [%d][%d]: ",x,y);
               vetor[x][y] = input.nextInt();
               soma = soma + vetor[x][y]; 
               cont++;
            if(vetor[x][y]>maior || maior==0){
                maior = vetor[x][y];
            }
            if(vetor[x][y]<menor || menor==0){
                menor = vetor[x][y];
            }
           }
       }
       media= soma/cont;
       System.out.println("Esse e o menor valor da matriz: " + menor);
       System.out.println("Esse e o maior numero da matriz: " + maior);
       System.out.println("Essa e a soma de todos os numeros da matriz: " + soma);
       System.out.println("Essa e a media dos valores da matriz: " + media);
       input.close();
    }
}