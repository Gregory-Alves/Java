package aula_7;
class exercicio2 {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        calc.soma(5,5);
        calc.subtracao(10,5);
        calc.multiplicar(2, 5);
        calc.divisao(10, 2);       
    }
}

class Calculadora{

    double result;

    public void soma(double num1, double num2){
        result=num1+num2;
        System.out.println("Esse e o valor da soma dos 2 numeros: " + result);
    }

    public void subtracao(double num1, double num2) {
        result = num1 - num2;
        System.out.println("O resultado da subtração é: "+result);
    }

    public void multiplicar(double num1, double num2) {
        result = num1 * num2;
        System.out.println("A multiplicação entre os dois números é: "+result);
    }

    public void divisao(double num1, double num2){
        if (num2 !=0 &&  num1!=0) {
            result = num1 / num2;
            System.out.println("O valor da divisão é: "+result);
        }
        if(num1 == 0 || num2 == 0){
            System.out.println("Nao tem como dividir quando um dos dois numeros sao (0) ");
        }
    }
}
