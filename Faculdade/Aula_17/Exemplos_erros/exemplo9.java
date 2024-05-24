package Aula_17.Exemplos_erros;
//utiliza a as classes ArithmeticException e ArrayIndexOutOfBoundsException a fim de mostrar mensagens personalizadas. Esses blocos nunca serão executadas por conta da classe Exception no primeiro bloco catch que engloba as classes ArithmeticException e ArrayIndexOutOfBoundsException. O Java não compilará o programa.
class Exemplo {
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30, 100};
        int pesos[] = {2, 0, 4};
        
        Matematica matematica = new Matematica();
        
        System.out.println("Numeros:");
        
        int resultado;
        
        for(int i = 0; i < 4; i++){
            /* Tenta executar */
            try{
                matematica.dividir(numeros[i], pesos[i]);
            }
            /* Captura o erro */
            catch(Exception e){
                System.out.println("Erro generico");
            }
            /* Os proximos catchs nunca serao executados. O Java acusara erro */
            /*catch (ArithmeticException e){
                System.out.println("Erro de calculo: " + e.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e){
                 System.out.println("Erro de vetor: " + e.getMessage());
            }*/
        }
    }
}
 
class Matematica{
    public static void dividir(int num1, int num2){
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
    }
}
