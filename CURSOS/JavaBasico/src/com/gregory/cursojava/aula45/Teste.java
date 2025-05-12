package com.gregory.cursojava.aula45;

public class Teste {
    public static void main(String[] args) {

        /*Aluno aluno = new Aluno();
        Pessoa pessoaAluno = new Aluno(); //upcasting

        Pessoa aluno2 = (Pessoa) new Aluno();

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;*/

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        if (pessoa instanceof Pessoa) {
            System.out.println("É do tipo pessoa");
        }

        if (aluno instanceof Aluno) {
            System.out.println("É do tipo aluno");
        }

        if (prof instanceof Professor) {
            System.out.println("É do tipo professor");
        }
    }
}
