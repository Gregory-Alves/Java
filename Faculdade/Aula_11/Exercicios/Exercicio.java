package Aula_11.Exercicios;

public class Exercicio {
    public static void main(String[] args){
        Produto produto1 = new Produto("Queijo" , 8.50);
        Produto produto2 = new Produto("Presunto", 6.75);
        Produto produto3 = new Produto("Coca Cola", 11.99);
        Produto produto4 = new Produto("Agua", 4.00);

        Secao secao1 = new Secao("Frios");
        secao1.adicionarProduto(produto1);
        secao1.adicionarProduto(produto2);

        Secao secao2 = new Secao("Bebidas");
        secao2.adicionarProduto(produto3);
        secao2.adicionarProduto(produto4);

        Loja loja1 = new Loja("Mercadinho da dona Jozefa");
        loja1.adicionarSecao(secao1);
        loja1.adicionarSecao(secao2);

        loja1.mostrarInformacoes();
    }
}

class Produto{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }
}

class Secao{
    private String nome;
    private Produto[] produtos;
    private int numProdutos;

    public Secao(String nome){
        this.nome = nome;
        this.produtos = new Produto[10];
        this.numProdutos = 0;
    }
    
    public void adicionarProduto(Produto produto){
        produtos[numProdutos] = produto;
        numProdutos++;
    }

    public void mostrarInformacoes(){
        System.out.println("\nSecao: " + this.nome);
        for(int i=0; i<numProdutos; i++){
            System.out.println(produtos[i].getNome() + " - R$" + produtos[i].getPreco());
        }
    }
}

class Loja{
    private String nome;
    private Secao[] secoes;
    private int numSecoes;

    public Loja(String nome){
        this.nome = nome;
        this.secoes = new Secao[10];
        this.numSecoes = 0;
    }

    public void adicionarSecao(Secao secao){
        secoes[numSecoes] = secao;
        numSecoes ++;
    }

    public void mostrarInformacoes(){
        System.out.println("Loja: " + this.nome);
        for(int i=0; i<numSecoes; i++){
            secoes[i].mostrarInformacoes();
        }
    }
}