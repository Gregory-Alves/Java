public class teste {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 100};
        int[] pesos = {2, 3, 0, 5};

        try {
            int resultado;
            for (int i = 0; i < 4; i++) {
                resultado = numeros[i] / pesos[i];
                System.out.printf("%d / %d = %d\n", numeros[i], pesos[i], resultado);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim do programa");
        }
    }
}
