package Aula_15_data_e_hora.exemplos;
//formatando a saída da data.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 
class Exemplo2 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Hoje e: " + hoje.format(formato));
    }
}