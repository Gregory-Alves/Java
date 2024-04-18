package Aula_5;

import java.util.Scanner;



class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("##########################################");
        System.out.println("# Informe qual e o seu tipo de contrato: #");
        System.out.println("# Digite (1) para pessoa fisica          #");
        System.out.println("# Digite (2) para comercio               #");
        System.out.println("# Digite (3) para industria              #");
        System.out.println("########################################");
        int tipo = input.nextInt();
        
        float total = energia.calcEnergia(tipo);
        System.out.printf("Esse e o valor total a pagar: R$%.2f", total);
        input.close();
    }
}

class energia {
    public static float calcEnergia(int tipo){
         Scanner input = new Scanner(System.in);
       
       float mult = 0.00f;
        if (tipo == 1){
            mult = 0.6f;
        }
        if (tipo == 2){
            mult = 0.48f;
        }
        if (tipo == 3){
            mult = 1.29f;
        }
        if (tipo == 0 || tipo >3) {
            System.out.println("Opcao invalida, rode novamente o codigo!");
        }
        System.out.println("Quantos Kw voce consumiu nesse mes? ");
        float kw = input.nextFloat();
        kw= kw * mult;
        input.close();
        return kw;
    }
}