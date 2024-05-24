package Aula_17.Exemplos_erros;
//tenta executar o código e captura o erro.
class Exemplo {
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30};
        System.out.println("Numeros:");
        
        /* Tenta executar */
        try{
	        System.out.println(numeros[5]);
        }
        /* Captura o erro */
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
