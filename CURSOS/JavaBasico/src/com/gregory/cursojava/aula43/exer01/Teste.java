package com.gregory.cursojava.aula43.exer01;

public class Teste {
    public static void main(String[] args) {

        System.out.println("************ Teste Conta Bancaria **********");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Gregory");
        contaSimples.setNumeroConta("11111");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("************* Teste Conta Poupança **********");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Poupador");
        contaPoupanca.setNumeroConta("22222");
        contaPoupanca.setDiaRendimento(8);

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado! Novo saldo é de: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento!");
        }

        System.out.println("\n" + contaPoupanca);

        System.out.println("************ Teste Conta Especial **********");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Especialzinho");
        contaEspecial.setNumeroConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque realizado com sucesso! Novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para sacar: " + valor + "; Seu saldo é: " + conta.getSaldo());
        }
    }
}

