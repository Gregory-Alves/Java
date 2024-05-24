package Aula_17.Exemplos_erros;
//uso de printStackTrace( ) para mostrar em qual classe acontece o erro.
class Exemplo {
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30, 100};
        int pesos[] = {2, 0, 4}; /* Divisao por 0 */
        
        Matematica matematica = new Matematica();
        
        System.out.println("Numeros:");
        
        int resultado;
        
        for(int i = 0; i < 4; i++){
            /* Tenta executar */
            try{
                matematica.dividir(numeros[i], pesos[i]);
            }
            /* Captura o erro */
            catch (Exception e){
                e.printStackTrace(); /* Mostra em qual classe aconteceu o erro */
            }
        }
    }
}
 
class Matematica{
    public static void dividir(int num1, int num2){
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
    }
}

