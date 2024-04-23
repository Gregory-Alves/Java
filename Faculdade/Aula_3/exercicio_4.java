package Aula_3;

import java.util.Scanner;
class exercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int y=1;
        int total = 0;
        
        for(@SuppressWarnings("unused")
        int x = 1; y !=0; x++){
            System.out.println("Digite o numero que voce quer somar? " );
            
             y = input.nextInt();
             
             total = total + y;
        }
        System.out.println("Esse e o total: " + total);
        input.close();
    }
}