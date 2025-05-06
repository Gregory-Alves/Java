package com.gregory.cursojava.aula27;

public class lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void mudarEstado() {
        if(ligada){
            ligada = false;
        } else {
            ligada = true;
        }
    }

    void mostrarEstado() {
        if(ligada){
            System.out.println("A lampada esta ligada ");
        } else {
            System.out.println("A lampada esta desligada ");
        }
    }
}
