package Aula_15_data_e_hora.exemplos;
//formatando a saída da hora.
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
 
class Exemplo {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        
        /* Formato de 24 horas */
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        /* Formato de 12 horas */
        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm:ss a");
        
        System.out.println("Agora e: " + agora.format(formato));
      }
  }
