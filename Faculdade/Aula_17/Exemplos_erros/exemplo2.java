package Aula_17.Exemplos_erros;
//erro ao acessar um elemento fora do array. Ao gerar uma exceção, o programa é encerrado.
class Exemplo {
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30};
        System.out.println("Numeros:");
        System.out.println(numeros[5]); /* O Java em momento algum acusou erro nessa linha */
        System.out.println("Mensagem final"); /* A mensagem final nao foi impressa */
    }
}
