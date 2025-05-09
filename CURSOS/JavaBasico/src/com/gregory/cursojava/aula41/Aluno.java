package com.gregory.cursojava.aula41;

public class Aluno extends Pessoa {

    private String Curso;
    private double[] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.Curso = curso;
    }

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

    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno:  ";
        s += super.getEndereco();
        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System .out.println("Imprimindo endereco do aluno: ");
        System .out.println(this.obterEtiquetaEndereco());
    }
}
