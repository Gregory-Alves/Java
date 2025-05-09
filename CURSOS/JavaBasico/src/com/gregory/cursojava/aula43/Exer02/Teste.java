package com.gregory.cursojava.aula43.Exer02;

public class Teste {
    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("Contribuinte 01");
        pf1.setRendaBruta(1000);
        pf1.setCpf("111.111.111-11");

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setNome("Contribuinte 02");
        pj1.setRendaBruta(5000);
        pj1.setCnpj("222.222.222/2222-22");

        PessoaFisica pf2 = new PessoaFisica();
        pf2.setNome("Contribuinte 03");
        pf2.setRendaBruta(2000);
        pf2.setCpf("333.333.333-33");


        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.setNome("Contribuinte 04");
        pj2.setRendaBruta(3000);
        pj2.setCnpj("444.444.444/4444-44");

        PessoaFisica pf3 = new PessoaFisica();
        pf3.setNome("Contribuinte 05");
        pf3.setRendaBruta(3700);
        pf3.setCpf("555.555.555-55");

        PessoaJuridica pj3 = new PessoaJuridica();
        pj3.setNome("Contribuinte 06");
        pj3.setRendaBruta(4000);
        pj3.setCnpj("666.666.666/6666-66");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pf1;
        contribuintes[1] = pj1;
        contribuintes[2] = pf2;
        contribuintes[3] = pj2;
        contribuintes[4] = pf3;
        contribuintes[5] = pj3;

        for (Contribuinte c : contribuintes) {
            System.out.println(c.toString());
        }
    }
}
