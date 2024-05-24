package Aula_17.Exemplos_erros;
//divisão entre elementos de 2 arrays. O código funciona corretamente.
class Exemplo {
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30, 100};
        int pesos[] = {2, 3, 4, 5};
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
