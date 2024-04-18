package Aula_5;

import java.util.Scanner;

class Exercicio1 {
  public static void main(String[] args) {
    float[] notas = new float[3];
    String nome = "";
    float media = exercicio_1.calcularMedia(notas, nome);

    System.out.printf("A media do aluno %s e: %.1f\n", nome, media);
  }
}

class exercicio_1 {
    public static float calcularMedia(float[] notas, String nome) {
      Scanner input = new Scanner(System.in);
      System.out.println("Escreva o nome do aluno: ");
      nome = input.nextLine();
  
      float soma = 0;
      for (int i = 0; i < 3; i++) {
        System.out.printf("Digite a [%d] nota do aluno: ", i + 1);
        notas[i] = input.nextFloat();
        soma += notas[i];
      }
  
      float media = soma / notas.length;
      input.close();
      return media;
    }
  }
  
