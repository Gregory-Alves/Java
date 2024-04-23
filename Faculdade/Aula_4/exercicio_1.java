package Aula_4;

import java.util.Scanner;

class exercicio_1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int vetor[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            System.out.printf("Informe elemento [%d]: ", i);
            vetor[i] = input.nextInt();
        }
        
        for(int i = 4; i > -1; i--){
            System.out.print(vetor[i] + " ");}
    
    input.close();
    }
}
