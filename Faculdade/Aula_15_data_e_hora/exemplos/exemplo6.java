package Aula_15_data_e_hora.exemplos;
//lendo uma data informada pelo usuário.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
 
class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataString = scanner.nextLine();
 
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate data = LocalDate.parse(dataString, formato);
        String dataFormatada = data.format(formato);
        System.out.println("Data digitada: " + dataFormatada);
    }
}

