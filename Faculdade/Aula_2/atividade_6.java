package Aula_2;
import java.util.Scanner;

public class atividade_6 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite um numero de 1 a 9 para ve-lo por extenso: ");
        int num = input.nextInt();
        switch (num){
            
            case 1:  System.out.println ("um"); 
            break;

            case 2:  System.out.println ("dois"); 
            break;

            case 3:  System.out.println ("tres"); 
            break;

            case 4:  System.out.println ("quatro"); 
            break;

            case 5:  System.out.println ("cinco"); 
            break;

            case 6:  System.out.println ("seis"); 
            break;

            case 7:  System.out.println ("sete"); 
            break;

            case 8:  System.out.println ("oito"); 
            break;

            case 9:  System.out.println ("nove"); 
            break;

            default: System.out.println("Numero invalido!");
            break;

            
        }

        input.close();
    }
}
