package com.gregory.cursojava.aula40;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, Num 1");
        aluno.setEndereco("Rua 2, Num 2");
        professor.setEndereco("Rua 3, Num 3");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}
