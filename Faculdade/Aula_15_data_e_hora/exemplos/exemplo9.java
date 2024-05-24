package Aula_15_data_e_hora.exemplos;
//obtendo a diferença de tempo entre dois horários.
import java.time.LocalTime;
import java.time.Duration;
 
class DiferencaTempo {
    public static void main(String[] args) {
        LocalTime horaInicial = LocalTime.of(9, 30);
        LocalTime horaFinal = LocalTime.of(13, 45);
 
        Duration diferenca = Duration.between(horaInicial, horaFinal);
        
        long horas = diferenca.toHours();
        long minutos = diferenca.toMinutes() % 60;
 
        System.out.println("Diferenca de tempo: " + horas + " horas e " + minutos + " minutos.");
    }
}
