package Aula_17.Exemplos_erros;
//utilização de finally. O código inserido no bloco finally é sempre executado.
class Exemplo {
    public static void main(String[] args) {
        try{
            System.out.println("Mensagem antes da excecao");
            int resultado = 10 / 0;
            System.out.println("Mensagem apos da excecao");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /* Sempre vai ser executado */
        finally{
            System.out.println("Sempre sera executado");
        }
    }
}