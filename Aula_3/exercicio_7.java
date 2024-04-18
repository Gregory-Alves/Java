package Aula_3;

class exercicio_7 {
    public static void main(String[] args) {
   
    float num2 =100; 
    float result =0;    
    for(float num1 = 1; num1 <=100; num1++){    
        result= result + (num1/num2);
        num2--;
    } 
         System.out.println(result);
    }
}