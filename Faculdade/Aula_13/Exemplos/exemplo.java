package Aula_13.Exemplos;

import java.util.List;
import java.util.ArrayList;

class exemplo{
    public static void main(String[] args){
        List<String> frutas = new ArrayList<>();

        frutas.add("Banana");
        frutas.add("Kiwi");
        frutas.add("Morango");
        frutas.add("Abacaxi");

        System.out.println("Frutas " + frutas);

        System.out.println("Frutas da lista: ");
        for(String elemento : frutas){
            System.out.println(elemento);
        }
    }
}