package Aula_10;

class exemplo {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcelo", "marcelo@exemplo.com", "Rua 1, 270");
        Pedido pedido1 = new Pedido(1,230.50, cliente1);
        pedido1.imprimirDetalhes();

        Pedido pedido2 = new Pedido(2, 150.70, cliente1);
        pedido2.imprimirDetalhes();
    }
}

class Cliente{
    public String nome;
    public String email;
    public String endereco;
    
    //Construtor da Classe
    public Cliente (String nome, String email, String endereco){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }

    public String  getEmail() {
        return this.email;
    }

    public String getEndereco() {
        return this.endereco;
    }
}

class Pedido{   
    public int numeroPedido;
    public double valorTotal;
    public Cliente cliente;
    
    public  Pedido(int numeroPedido, double valorTotal, Cliente cliente ){
       this.numeroPedido=numeroPedido;
       this.valorTotal=valorTotal;
       this.cliente=cliente;
    }

    public void  imprimirDetalhes(){
        System.out.println("Numero do pedido: " + this.numeroPedido + "\nTotal do pedido: " + this.valorTotal + "\nNome do cliente: " + cliente.getNome() + "\nEmail: " + cliente.getEmail() + "\nEndereço: " + cliente.getEndereco() + "\n\n");
    }
}