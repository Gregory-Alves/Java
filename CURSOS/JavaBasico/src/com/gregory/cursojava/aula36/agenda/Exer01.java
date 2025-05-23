package com.gregory.cursojava.aula36.agenda;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda: ");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i <3; i++) {
            System.out.println("Entre com as informacoes do contato: \n ");
            Contato c = new Contato();

            System.out.println("Entre com o nome: ");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email:");
            String email = scan.nextLine();
            System.out.println("\n");
            c.setEmail(email);
            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if(agenda != null){
            System.out.println(agenda.obterInfo());
        } else {
            System.out.println("Agenda vazia");
        }
    }
}
