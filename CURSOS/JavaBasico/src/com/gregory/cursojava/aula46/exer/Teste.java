package com.gregory.cursojava.aula46.exer;

import java.sql.SQLOutput;

public class Teste {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        quadrado.setNome("Quadrado");

        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.setNome("Circulo");

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(3);
        triangulo.setNome("Triangulo");

        Cubo cubo = new Cubo();
        cubo.setLado(3);
        cubo.setNome("Cubo");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(3);
        cilindro.setRaio(2);
        cilindro.setNome("Cilindro");

        Piramide piramide = new Piramide();
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setNumPoliBase(4);
        piramide.setBase(quadrado);
        piramide.setNome("Pirâmide");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quadrado;
        figuras[1] = circulo;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;

        for (FiguraGeometrica figura : figuras) {
            System.out.println("--------------------------------------");
            System.out.println(figura.getNome());

            if(figura instanceof Figura2D){
                Figura2D f2D = (Figura2D) figura;
                System.out.println("Area: " + f2D.calcularArea());
            }

            if(figura instanceof Figura3D){
                Figura3D f3D = (Figura3D) figura;
                System.out.println("Area: " + f3D.calcularArea());
                System.out.println("Volume: " + f3D.calcularVolume());
            }
        }

    }
}
