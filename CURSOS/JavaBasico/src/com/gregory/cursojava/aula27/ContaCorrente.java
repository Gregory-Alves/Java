package com.gregory.cursojava.aula27;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    void extrato() {
        System.out.println("O número da conta corrente: " + numero);
        System.out.println("A agência da conta corrente: " + agencia);
        System.out.println("Especial: " + especial);
        System.out.println("Limite Especial: " + limiteEspecial);
        System.out.println("Valor Especial Disponível: " + (limiteEspecial - valorEspecialUsado));
        System.out.println("Saldo: " + saldo);
    }

    boolean saque(double valorSaque) {
        boolean sucesso = false;

        // Tem saldo na conta
        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            sucesso = true;
        } else { // Não tem saldo na conta
            if (especial) { // Verificar se a conta tem cheque especial
                double limite = limiteEspecial + saldo;

                if (limite >= valorSaque) {
                    saldo -= valorSaque;
                    valorEspecialUsado = Math.abs(saldo); // Atualiza o valor usado do limite especial
                    sucesso = true;
                }
            }
        }

        // Chama a função saqueEfetuado para exibir o resultado
        saqueEfetuado(sucesso, valorSaque);
        return sucesso;
    }

    void saqueEfetuado(boolean sucesso, double valorSaque) {
        if (sucesso) {
            System.out.println("Saque de R$" + valorSaque + " efetuado com sucesso!");
        } else {
            System.out.println("Saque de R$" + valorSaque + " não efetuado. Saldo insuficiente.");
        }
        System.out.println("Saldo atual: R$" + saldo);
    }

    void depositoEfetuado(boolean sucesso, double valorDeposito) {
        if (sucesso) {
            System.out.println("Depósito de R$" + valorDeposito + " efetuado com sucesso!");
        } else {
            System.out.println("Depósito de R$" + valorDeposito + " não efetuado. Valor inválido.");
        }
        System.out.println("Saldo atual: R$" + saldo);
    }

    void deposito(double valorDeposito) {
        boolean sucesso = false;
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            sucesso = true;
        }
        depositoEfetuado(sucesso, valorDeposito);
    }
}