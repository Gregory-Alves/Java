package Aula_13.Atividade;

import java.util.Map;
import java.util.TreeMap;

public class mapas {
    public static void main(String[] args){

        //Crie um mapa com (matricula, nome, disciplina e nota) em uma turma.
        Map<Integer, Aluno> turma = new TreeMap<>();
        
        turma.put(1, new Aluno("Joao", "Matematica", 8.5));
        turma.put(2, new Aluno("Lucas", "Portugues", 10));
        turma.put(3, new Aluno("Gabriel", "Ingles", 9));
        turma.put(4, new Aluno("Bernardo", "Artes", 6));
        turma.put(5, new Aluno("Neymar", "Historia", 7.4));

        System.out.println("Alunos da turma\n");
        for (Map.Entry<Integer, Aluno> alunos : turma.entrySet()) {
            alunos.getValue().mostrarInformacoes();
            System.out.println();
        }

        //Atualize a nota de um aluno.  
        turma.get(1).setNota(9.5);
        System.out.println("Alunos da turma\n");
        for (Map.Entry<Integer, Aluno> alunos : turma.entrySet()) {
            alunos.getValue().mostrarInformacoes();
            System.out.println();
        }

        turma.remove(5);
        System.out.println("Alunos da turma\n");
        for (Map.Entry<Integer, Aluno> alunos : turma.entrySet()) {
            alunos.getValue().mostrarInformacoes();
            System.out.println();
        }

        turma.clear();
        System.out.println("Alunos da turma\n");
        for (Map.Entry<Integer, Aluno> alunos : turma.entrySet()) {
            alunos.getValue().mostrarInformacoes();
            System.out.println();
        }

    }
}

class Aluno{
    private String nome;
    private String disciplina;
    private double nota;

    public Aluno(String nome, String disciplina, double nota){
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Nota: " + this.nota);
    }

    public void setNota(double nota){
        this.nota = nota;
    }
}