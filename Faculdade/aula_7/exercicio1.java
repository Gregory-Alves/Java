package aula_7;

class exercicio1 {
    public static void main(String[] args){
        Livro l1 = new Livro();
        l1.autor = "Ana Maria Machado";
        l1.titulo = "Bento que Bento é o Frade";
        l1.ano = 1997;

        Livro l2 = new Livro();
        l2.autor = "Ana Maria Machado";
        l2.titulo = "Menina Bonita do Laço de Fita";
        l2.ano = 1986;

        Livro l3 = new Livro();
        l3.autor = "Edimilson de Almeida Pereira";
        l3.titulo ="O Primeiro Menino";
        l3.ano = 1980;

        l1.status();
        l2.status();
        l3.status();
    }
}

class Livro {
    String titulo;
    String autor;
    int ano;

    public void status() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano + "\n");
    }
}