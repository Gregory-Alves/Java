package com.gregory.cursojava.aula43.exer03;

public class Mamifero extends Animal{

    private String alimento;

    public Mamifero() {
        super();
        this.setCor("Castanho");
        this.setAmbiente("Terra");
        this.setAlimento("Mel");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + this.getAlimento();
        return s;
    }
}
