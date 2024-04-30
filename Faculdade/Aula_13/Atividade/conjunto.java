package Aula_13.Atividade;
import java.util.Set;
import java.util.TreeSet;

public class conjunto {
    public static void main(String[] args){
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        if(numeros.contains(30)){
            System.out.println("O numero 30 existe no conjunto");
        }
        else{
            System.out.println("O numero 30 nao existe no conjunto");
        }

        if (numeros.add(20)) {
            System.out.println("Numero 20 adicionado ao conjunto");
        } else {
            System.out.println("Numero 20 ja existe no conjunto");
        }

        numeros.remove(40);
        System.out.println("Numero 40 foi removido do conjunto");

        System.out.println("Tamanho do conjunto: " + numeros.size());

        System.out.println("Elementos do conjunto: " + numeros);

        numeros.clear();
        System.out.println("Elementos do conjunto: " + numeros);
    }
    
}
