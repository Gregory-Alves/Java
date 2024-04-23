package Aula_6;

class Conta{
    String nome;
    double saldo = 0;
    int conta =0;

    public void status(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Esse e o numero da conta: " + this.conta);
    }

    public void deposito(double valor){
        this.saldo += valor;
        this.status();
    }

    public void saque(double valor){
        if  (this.saldo == 0) {
            System.out.println(this.nome + " Impossivel realizar o saque pois voce esta liso e a conta esta zerada!\n");
        }
            
        else if(valor > this.saldo){
            System.out.println("Valor insuficiente!\n");
    }

        else if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("\n" + this.nome + " Saque realizado com sucesso!");
            System.out.println("Novo saldo em conta: R$" + this.saldo);
            
        }
    }
}

 class exercicio1 {
    public static void  main(String[] args) {
        int cont_conta = 1;

        Conta c1 = new Conta();
        c1.nome = "Marcelo";
        c1.conta = cont_conta;
        cont_conta++;


        Conta c2 = new Conta();
        c2.nome = "Leandro"; 
        c2.conta = cont_conta;
        cont_conta++;

       // c1.deposito(500);
        c1.saque(1000);

        c2.deposito(1000);
        c2.saque(500);
    }
}
