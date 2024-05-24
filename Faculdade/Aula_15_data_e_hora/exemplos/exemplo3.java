package Aula_15_data_e_hora.exemplos;
//obtendo a hora do sistema operacional.
import java.time.LocalTime;
 
class Exemplo {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        System.out.println("Agora e: " + agora);
    }
}