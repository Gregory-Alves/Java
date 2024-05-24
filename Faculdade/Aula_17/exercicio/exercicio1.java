package Aula_17.exercicio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorFinanciado = 0;
        double taxaJurosMensal = 0;
        int numeroParcelas = 0;

        try {
            // Obter entrada do usuário para o valor financiado
            System.out.print("Digite o valor financiado: ");
            valorFinanciado = scanner.nextDouble();

            // Obter entrada do usuário para a taxa de juros mensal
            System.out.print("Digite a taxa de juros mensal (em %): ");
            taxaJurosMensal = scanner.nextDouble();

            // Obter entrada do usuário para o número de parcelas
            System.out.print("Digite o número de parcelas: ");
            numeroParcelas = scanner.nextInt();

            // Verificar se os valores são positivos
            if (valorFinanciado <= 0 || taxaJurosMensal <= 0 || numeroParcelas <= 0) {
                throw new IllegalArgumentException("Todos os valores informados devem ser positivos.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira valores numéricos.");
            scanner.next(); // Limpar o buffer do scanner
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        }

        try {
            // Calcular o valor total a ser pago
            double valorTotal = valorFinanciado + (valorFinanciado * (taxaJurosMensal / 100) * numeroParcelas);

            // Calcular o valor de cada parcela
            double valorParcela = valorTotal / numeroParcelas;

            // Calcular o valor dos juros
            double valorJuros = valorTotal - valorFinanciado;

            // Apresentar os resultados ao usuário
            System.out.printf("Valor Financiado: R$ %.2f%n", valorFinanciado);
            System.out.printf("Valor dos Juros: R$ %.2f%n", valorJuros);
            System.out.printf("Valor Total: R$ %.2f%n", valorTotal);
            System.out.printf("Número de Parcelas: %d%n", numeroParcelas);
            System.out.printf("Valor de Cada Parcela: R$ %.2f%n", valorParcela);

        } catch (Exception e) {
            System.out.println("Erro ao calcular os valores: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
