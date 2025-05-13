package com.gregory.cursojava.aula52;

public class DivisaoNaoExata extends Exception {

    private int num;
    private int denominador;

    public DivisaoNaoExata(int num, int denominador) {
        super();
        this.num = num;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + denominador + " não é um inteiro";
    }
}
