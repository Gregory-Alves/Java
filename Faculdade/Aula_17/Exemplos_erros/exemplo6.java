package Aula_17.Exemplos_erros;
//erro de divisão por 0. O código tem continuidade de execução e chega ao erro seguinte (a divisão por um elemento que não existe no array pesos) por conta do for fora do try... catch.
class Exemplo {
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30, 100};
        int pesos[] = {2, 0, 4};
        System.out.println("Numeros:");
        
        int resultado;
        
        for(int i = 0; i < 4; i++){
            /* Tenta executar */
            try{
                resultado = numeros[i] / pesos[i];
                System.out.printf("%d / %d = %d\n", numeros[i], pesos[i], resultado);
            }
            /* Captura o erro */
            catch (Exception e){
                System.out.println("Erro da excecao: " + e.getMessage());
            }
        }
    }
}
