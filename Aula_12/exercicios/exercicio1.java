package Aula_12.exercicios;

public class exercicio1 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca do bairro");
        Livro livro1 = new Livro("Aventuras na Amazônia", "Joao", 5);
        Livro livro2 = new Livro("O pequeno Principe", "Douglas", 3);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.mostrarInformacoes();
        biblioteca.emprestarLivro(livro1);
        biblioteca.devolverLivro(livro2);
        biblioteca.mostrarInformacoes();
    }
}

class Livro{
    private String titulo;
    private String autor;
    private int numExemplares;

    public Livro(String titulo, String autor, int numExemplares){
        this.titulo = titulo;
        this.autor = autor;
        this.numExemplares = numExemplares;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getNumExemplares(){
        return this.numExemplares;
    }

    public void setNumExemplares(int numExemplares){
        this.numExemplares = numExemplares;
    }

    public void emprestarLivro(){
        if(this.getNumExemplares() > 0){
            this.setNumExemplares(numExemplares - 1);
            System.out.println("Livro emprestado com sucesso!");
        }

        if(this.getNumExemplares() < 1){
            System.out.println("Sem exemplares disponiveis do livro!");
        }
    }

    public void devolverLivro(){
        this.setNumExemplares(numExemplares + 1);
    }

    public void mostrarInformacoes(){
        System.out.println("Titulo: " + this.getTitulo() + "\nAutor: " + this.getAutor() + "\nNumero de exemplares: " + this.getNumExemplares());
    } 
}

class Biblioteca{
    private String nome;
    private Livro[] livros;
    private int numLivros;

    public Biblioteca(String nome){
        this.nome = nome;
        this.livros = new Livro[10];
        this.numLivros = 0;
    }

    public void adicionarLivro(Livro livro){

        if(numLivros >= 10){
            System.out.println("Biblioteca cheia!");
        }

        else if(numLivros < 10){
            livros[numLivros] = livro;
            numLivros++;
        }
    }

    public void mostrarInformacoes(){
        System.out.println("Biblioteca: " + nome + "\n");
        for(int i=0; i<numLivros; i++){
            System.out.println("Titulo: " + livros[i].getTitulo() + "\nAutor: " + livros[i].getAutor()+ "\nNumero de exemplares: " + livros[i].getNumExemplares() + "\n");
        }
    }

    public void emprestarLivro(Livro livro){
        livro.emprestarLivro();
    }

    public void devolverLivro(Livro livro){
        livro.devolverLivro();
    }
}
