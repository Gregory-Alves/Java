package Aula_10.exercicio;

import java.util.Scanner;

public class livrariaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Livro[] livro = new Livro[10];
        int numLivros = 0;
        Autor[] autor = new Autor[10];
        int numAutores = 0;
        String nomeBusca;
        boolean encontrado, executando = true;

        while(executando){
            System.out.println("[1] Adicionar autor");
            System.out.println("[2] Adicionar livro");
            System.out.println("[3] Buscar livro");
            System.out.println("[4] Buscar autor");
            System.out.println("[5] Excluir livro");
            System.out.println("[6] Listar livros");
            System.out.println("[7] Sair");
            int opcao = input.nextInt();

            input.nextLine();

            switch(opcao){
                
                case 1:

                if(numAutores == 10){
                    System.out.println("A lista de autores está cheia!\n");
                    break;
                }

                System.out.println("Informe o nome do autor: ");
                String nome = input.nextLine();

                System.out.println("Informe a nacionalidade do autor: ");
                String nacionalidade = input.nextLine();

                autor[numAutores] = new Autor(nome, nacionalidade);
                numAutores++;

                System.out.println("Autor cadastrado com sucesso! ");

                break;

                case 2:

                if(numLivros == 10){

                    System.out.println("A Lista de livros está cheia!\n");
                    break;
                }

                System.out.println("Informe o Titulo: ");
                String titulo = input.nextLine();

                System.out.println("Informe o ano de publicação: ");
                int anoPublicacao = input.nextInt();

                System.out.println("Informe o autor: ");
                String autor_ = input.nextLine();

                for(int i=0;i <= numAutores; i++){
                    if(autor[i].getNome().equalsIgnoreCase(autor_)){
                        livro[numLivros] = new Livro(titulo, anoPublicacao, autor[i]);
                        numLivros++;
                        System.out.println("Livro cadastrado com sucesso!");
                        break;
                    }

                    else{
                        System.out.println("Autor do livro nao encontrado na lista de autores!");
                        break;
                    }
                }

                case 3:

                //if(numLivros)
            }
        }
         input.close();
    }
}

class Autor{
    public String nome, nacionalidade;

    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
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

    public void setTitulo(String Titulo){
        this.titulo = Titulo;
    }

    public String getLivro(){
        return this.titulo;
    }

    public void setAnoPublicacao(int Ano){
        if (Ano > 0) {
            this.anoPublicacao = Ano;
        } 
        if (Ano < 0){
            System.out.println("É impossivel ter um livro com uma data negativa ou zerada! ");
        }
    }

    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public Autor getAutor(){
        return this.autor;
    }
}

