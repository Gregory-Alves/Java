package Aula_13.Atividade;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    public static void main(String[] args){

        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(10);
        numeros.add(20);
        numeros.add(21);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        if(numeros.contains(30)){
            System.out.println("O numero 30 esta na lista");
        }
        else{
            System.out.println("O numero 30 nao esta na lista");
        }

        if(numeros.contains(15)){
            System.out.println("O numero 15 esta na lista");
        }
        else{
            System.out.println("O numero 15 nao esta na lista");
        }

        numeros.add(60);

        System.out.println("Elementos da lista: " + numeros);

        Collections.sort(numeros);
        System.out.println("Lista ordenada em ordem crescente: " + numeros);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Lista ordenada em ordem decrescente: " + numeros);

        List<Integer> numerosPares = new ArrayList<>();

        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) % 2 == 0){
                numerosPares.add(numeros.get(i));
            }
        }

        System.out.println("Elementos da lista de numeros pares: " + numerosPares);

        numeros.clear();
        System.out.println("Elementos da lista: " + numeros);

        numerosPares.clear();
        System.out.println("Elementos da lista de numeros pares: " + numerosPares);
    }
}
