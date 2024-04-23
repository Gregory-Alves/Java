package Aula_4;

import java.util.Scanner;

class exercicio_2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int vetor[] = new int[5];
        int media = 0;

        for(int i = 0; i < 5; i++){
            System.out.printf("Informe elemento [%d]: ", i);
            vetor[i] = input.nextInt();
          media = media+vetor[i];
        }
        media = media / 5;
        System.out.println("A media e: " + media);
        System.out.println("Esses sao os numeros dos vetores maiores que a media");
        for(int i = 0; i < 5; i++){
           if (vetor[i]>=media) {
                System.out.print(" " + vetor[i]);
           }
        
         
    
    input.close();
    }
}
}
