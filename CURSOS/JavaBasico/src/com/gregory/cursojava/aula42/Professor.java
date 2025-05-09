package com.gregory.cursojava.aula42;

public class Professor {

    private double salario;
    private String nomeCurso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido() {
        return salario - (salario * 0.1);
    }

    public String obterEtiquetaEndereco() {
        String s = "Endereço do Professor:  ";
        //s += super.getEndereco();
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System .out.println("Imprimindo endereco do professor: ");
        System .out.println(this.obterEtiquetaEndereco());
    }
}
