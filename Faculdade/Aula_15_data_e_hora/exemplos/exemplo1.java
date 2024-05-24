package Aula_15_data_e_hora.exemplos;
//obtendo a data do sistema operacional.
import java.time.LocalDate;
 
class Exemplo {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje e: " + hoje);
    }
}
