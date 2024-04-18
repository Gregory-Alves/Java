package Aula_5;
import java.util.Scanner;

class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float horas [] = new float[3];
        for (int i=0;i<3;i++){
            System.out.printf("Digite quantas horas do nivel [%d] voce trabalhou:  " ,i + 1);
            horas[i] = input.nextFloat();
        }
        float salario = CalculoHoras.calcularHoras(horas);
        System.out.printf("O seu salario e de: R$%.2f\n", salario);
        
    input.close();
    }
    
}

class CalculoHoras {
    
    public static float calcularHoras(float horas[]){
            float total = 0.0f;
            float preco = 0;
            for(int i = 0; i < 3; i++){
                
                if(i==0){
                    preco = 20;
                    total += (preco*horas[i]); 
                }
                
                if(i==1){
                    preco = 25;
                    total += (preco*horas[i]); 
                }
                
                if(i==2){
                    preco = 30;
                    total += (preco*horas[i]); 
                }
                
            }
            return total;
        }
        
}
