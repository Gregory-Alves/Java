package com.gregory.cursojava.aula27;

public class exer02 {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        conta.saque(100);
        conta.deposito(1000);
    }
}