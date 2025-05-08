package com.gregory.cursojava.aula37;

public class Aluno extends Pessoa {

    private String Curso;
    private double[] notas;

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean verificarAprovado() {
        return calcularMedia() >= 7;
    }
}
