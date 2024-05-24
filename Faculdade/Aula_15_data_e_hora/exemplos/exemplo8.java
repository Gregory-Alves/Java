package Aula_15_data_e_hora.exemplos;
//obtendo a diferença de dias entre duas datas.
import java.time.LocalDate;
import java.time.Period;
 
class DiferencaTempo {
    public static void main(String[] args) {
        LocalDate dataInicial = LocalDate.of(1969, 3, 2);
        LocalDate dataFinal = LocalDate.of(2024, 5, 9);
 
        Period diferenca = Period.between(dataInicial, dataFinal);
 
        int anos = diferenca.getYears();
        int meses = diferenca.getMonths();
        int dias = diferenca.getDays();
 
        System.out.println("Diferenca de tempo: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
    }
}
