package Aula_12;

public class exercicio2 {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Biblioteca do bairro");
        Autor a1 = new Autor("Joao");
        Autor a2 = new Autor("Douglas");
        Livro l1 = new Livro("Aventuras na Amazônia", 2020 ,a1 );
        Livro l2 = new Livro("O pequeno Principe", 2018, a2);
        b1.adicionarLivro(l1);
        b1.adicionarLivro(l2);
        b1.mostrarInformacoes();
    }
}

class Biblioteca{
    private String nome;
    private Livro[] livros;
    private int numLivros;
    
    public Biblioteca(String Nome){
        this.nome = Nome;
        this.livros = new Livro[10];
        this.numLivros = 0;
    }

    public void adicionarLivro(Livro livro){
        if(numLivros < 10){
            livros[numLivros] = livro;
            numLivros++;
            System.out.printf("Livro " + numLivros + " adicionado a biblioteca");
        }  
        System.out.println("");
    }
    
    public void mostrarInformacoes(){
        System.out.println("\nBiblioteca: " + nome + "\n");
        for (int i=0; i < numLivros; i++){
            System.out.println("Titulo: " + livros[i].getNome() + "\nAutor: " + livros[i].getAutor().getNome() + "\nAno: " + livros[i].getAno() + "\n"); 
        }
    }
}

class Livro{
    private String nome;
    private int ano;
    private Autor autor;

    public Livro(String nome, int ano, Autor autor){
        this.nome = nome;
        this.ano = ano;
        this.autor = autor;
    }
    
    public String getNome(){
        return  this.nome;
    }

    public int getAno() {
        return this.ano;
    }

    public Autor getAutor(){
        return this.autor;
    }
}

class Autor{
    private String nome;

    public Autor(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}