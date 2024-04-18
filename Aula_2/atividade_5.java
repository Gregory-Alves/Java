package Aula_2;
import java.util.Scanner;

public class atividade_5 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Quantas impressoes desse arquivo voce deseja? ");
        int copias = input.nextInt();
        float total = 0.0f;
        if (copias > 100) {
            total += 25.00;
            copias -= 100;
            total += copias * 0.20;
        }

        else {
            total += copias * 0.25;
        }
            
        System.out.println("Suas copias deram o total de: R$" + total);
    input.close();
    }
}
