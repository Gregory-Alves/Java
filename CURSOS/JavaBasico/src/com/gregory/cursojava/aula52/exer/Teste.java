package com.gregory.cursojava.aula52.exer;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);

            if (opcao == 1) {//consultar contato
                consultarContato(scan, agenda);
            } else if (opcao == 2) {//adicionar contato
                adicionarContato(scan, agenda);
            }
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {

        try{
            System.out.println("Criando um contato, digite as informacoes:");
            String nome = leInformacaoString(scan, "Digite o nome do contato:");
            String telefone = leInformacaoString(scan, "Digite o telefone do contato:");
            String email = leInformacaoString(scan, "Digite o email do contato:");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println("Contato a ser criado");
            System.out.println(contato);

            agenda.addContato(contato);
        }

        catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda:");
            System.out.println(agenda);
        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = leInformacaoString(scan, "Digite o nome do contato que deseja consultar:");
        try {
            if (agenda.consultarContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato encontrado!");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leInformacaoString(Scanner scan, String msg){
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan){

        boolean entradaValida = false;
        int opcao = 3;

        while(!entradaValida){
            System.out.println("Digite a opcao desejada:");
            System.out.println("1 - Consultar contato");
            System.out.println("2 - Adicionar contato");
            System.out.println("3 - Sair");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if(opcao ==1 || opcao == 2 || opcao == 3){
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada invalida");
                }
            }
            catch (Exception e) {
                System.out.println("Entrada invalida. Digite novamente.\n");
            }
        }

        return opcao;
    }
}
