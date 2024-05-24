package Aula_15_data_e_hora.exemplos;
//diminuindo 10 dias de uma data.
import java.time.LocalDate;
 
class Exemplo {
    public static void main(String[] args) {
 
        LocalDate dataOriginal = LocalDate.of(2024, 5, 20);
 
        LocalDate dataSubtraida = dataOriginal.minusDays(10);
 
        System.out.println("Data original: " + dataOriginal);
        System.out.println("Data subtraida de 10 dias: " + dataSubtraida);
    }
}
