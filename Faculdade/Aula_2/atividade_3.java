package Aula_2;
import java.util.Scanner;

public class atividade_3 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Digite o numero: ");
        int num = input.nextInt();
        
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Seu numero e divisivel por 2 e por 3! ");
        }

        else {
            System.out.println("Seu numero nao e divisivel por 2 e 3! ");
        }
    input.close();
    }
}