package com.gregory.cursojava.aula36.curso;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo() {

        String info = "Nome do aluno: " + nome + "\n" + "; ";
        info += "Matricula: " + matricula + "\n" + "; ";
        info += "Notas: ";

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
            info += nota + " ";
        }
        double media = soma / notas.length;
        info += "\n" + "media =  " + media + " - ";
        if (media >= 7) {
            info += "Aprovado";
        } else {
            info += "Reprovado";
        }

        return info;
    }

    public double obterMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
