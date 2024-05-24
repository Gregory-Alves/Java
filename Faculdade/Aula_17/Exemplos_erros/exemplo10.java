package Aula_17.Exemplos_erros;
//a classe Exception foi inserida no último bloco catch. O Java compilará o programa.
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
            catch (ArithmeticException e){
                System.out.println("Erro de calculo: " + e.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e){
                 System.out.println("Erro de vetor: " + e.getMessage());
            }
            /* Captura outros erros */
            catch(Exception e){
                System.out.println("Erro generico");
            }
        }
    }
}
 
class Matematica{
    public static void dividir(int num1, int num2){
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
    }
}
