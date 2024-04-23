package CURSOS;

public class pesquisaBinaria {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        buscaBinaria(vetor, 6);
    }

    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        int numComparacoes = 0;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            numComparacoes++;
            if (vetor[meio] == valor) {
                System.out.println("Número de comparações: " + numComparacoes);
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        // Se o valor não foi encontrado, retorne -1 ou outro valor que indique que o valor não está presente.
        return -1;
    }
}
