package Aula_10.exercicio;

class livraria {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis", "Brasileira");
        Livro livro1 = new Livro("Quincas Borba", 1891,autor1);

        Autor autor2 = new Autor("George Orwell", "Britanica");
        Livro livro2 = new Livro("A revolucao dos bichos",1945,autor2);

        livro1.imprimirDetalhes();
        livro2.imprimirDetalhes();
    }
}

class Autor{

    public String nome, nacionalidade;
    
    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
        
        public String getNome(){
            return this.nome;
        }

        public String getNacionalidade(){
            return this.nacionalidade;
        }
}

class Livro{
    public String titulo;
    public int anoPublicacao;
    public Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public void imprimirDetalhes(){
        System.out.println("Titulo do livro: " + this.titulo + "\nAno de publicacao: " + this.anoPublicacao + "\nAutor: " + autor.getNome() + "\nNacionalidade do autor: " + autor.getNacionalidade() + "\n\n");
    }
}