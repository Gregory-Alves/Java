package Aula_17.Exemplos_erros;
//erro de divisão por 0. O código não tem continuidade de execução e não chega ao erro seguinte (a divisão por um elemento que não existe no array pesos) por conta do for dentro do bloco try.
class Exemplo {
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30, 100};
        int pesos[] = {2, 0, 4};
 
        System.out.println("Numeros:");
        
        /* Tenta executar */
        try{
            int resultado;
            for(int i = 0; i < 4; i++){
                resultado = numeros[i] / pesos[i];
                System.out.printf("%d / %d = %d\n", numeros[i], pesos[i], resultado);
            }
        }
        /* Captura o erro */
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
