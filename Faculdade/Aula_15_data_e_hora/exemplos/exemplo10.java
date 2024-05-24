package Aula_15_data_e_hora.exemplos;
//acrescentando 10 dias a uma data.
import java.time.LocalDate;
 
class Exemplo {
    public static void main(String[] args) {
        
        LocalDate dataOriginal = LocalDate.of(2024, 5, 10);
 
        LocalDate dataAcrescida = dataOriginal.plusDays(10);
 
        System.out.println("Data original: " + dataOriginal);
        System.out.println("Data acrescida de 10 dias: " + dataAcrescida);
    }
}
