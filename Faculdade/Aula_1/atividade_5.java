package Aula_1;

import java.util.Scanner;

class atividade_5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos litros cabe no seu tanque? ");
        float cap_tanq = input.nextFloat();
        
        System.out.print("Quantos litros voce abasteceu? ");
        float abast = input.nextFloat();
        
        System.out.print("Quantos KMs voce percorreu? ");
        float perc = input.nextFloat();
        
        float gas_rest = cap_tanq - abast;
        
        float cons_med = perc / abast;
        System.out.println("Essa e a quantidade de km que o seu carro faz por litro: " + cons_med);
        
        float aut_rest = gas_rest * cons_med;
        System.out.println("Esse e a quantidade de KMs que voce poderia rodar com o carro sem ter abastecido: " + aut_rest);
        
        input.close();
        
        
        }
}
