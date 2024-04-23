package Aula_3;
import java.util.Scanner;

class exercicio_6 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         //1, 1, 2, 3, 5, 8,13, 21, 34, 55)
         int num1= 1;
         int num2= 0;
         int num3=0;
         System.out.println("1");
         
         for(int x = 0; x <=8; x++){
            num3=num1;
            num1=num1+num2;
            num2=num3;
            System.out.println(num1);
         }
      input.close();
    }
}
