package com.gregory.cursojava.aula48;

public class MultiplosCatchGenerico {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try{
                System.out.println(i+1 + ". " + numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            catch(ArithmeticException e){
                System.out.println(i+1 + ". Erro ao dividir por zero");
            }
            catch(Throwable e){
                System.out.println(i+1 + ". Ocorreu um erro!");
            }
        }
    }
}
