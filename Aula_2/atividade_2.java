package Aula_2;
import java.util.Scanner;
public class atividade_2{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int num[] = new int[3];
        int num_menor = 0;
        
        for(int i = 0; i<3; i++){
            System.out.printf("Digite o %d numero: ", i + 1);
            num[i] = input.nextInt();
           
            if(num_menor == 0 || num[i] < num_menor){
                num_menor = num[i];
            }
        }
        System.out.printf("Esse e o menor numero informado: " + num_menor);

        input.close();
    }
}
