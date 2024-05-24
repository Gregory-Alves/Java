package Aula_15_data_e_hora.exemplos;
//ajustando o fuso horário.
import java.time.LocalTime;
import java.time.ZoneId;
 
class Exemplo {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Agora e: " + agora);
    }
}
