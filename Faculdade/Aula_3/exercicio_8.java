package Aula_3;

import java.util.Scanner;
class exercicio_8 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
   
    float maior=0;
    float menor=0;
    float num=1;
    
     for(@SuppressWarnings("unused")
    int x =0; num!=0; x++){
    System.out.println("Digite o numero quer saber a amplitude:" );
    num = input.nextFloat();    
     
     if (maior == 0){ 
         maior = num;
         menor= num;
     }
    
    if (num > maior){
        maior = num;
    }     
        
    if (num < menor && num != 0){
        menor = num;
    } 
     }
    
    num= maior-menor; 
    System.out.println("Esse foi o menor numero: " + menor );
    System.out.println("Esse foi o maior numero: " + maior );
    System.out.println("Essa e a amplitude dos dois: "  + num);
    
    input.close();
    }
}