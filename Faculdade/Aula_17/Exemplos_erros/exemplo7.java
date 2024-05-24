package Aula_17.Exemplos_erros;
//uso de printStackTrace( ) para mostrar em qual classe acontece o erro.
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
                e.printStackTrace(); /* Mostra em qual classe aconteceu o erro */
            }
        }
    }
}
