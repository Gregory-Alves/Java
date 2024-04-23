package Aula_8_Ativ_Aval;
class Atividade{
    public static void main(String[] args){
        Conta c1 = new Conta();//Cria uma conta 
        c1.Depositar(50);//Testa o deposito com a conta fechada
        c1.Sacar(50);//Testa o saque com a conta fechada
        c1.FecharConta();//Testa se tem como fechar uma conta fechada
        c1.PagarMensalidade();//Testa a funcao de pagar mensalidade com a conta fechada
        c1.AbrirConta(1, "CC", "Gregory Alves");// Abre a conta no modo CC
        c1.AbrirConta(1, "CP", "Greg");//Testa se a conta já esta aberta
        c1.FecharConta();//Testa se tem como fechar uma conta com saldo
        c1.Depositar(1000);//Testa o deposito na conta
        c1.PagarMensalidade();//Testa a funcao de pagar mensalidade no modo CC
        c1.Sacar(1500);//Testa sacar mais do que o valor disponivel no saldo da conta
        c1.Sacar(1038);//Testa sacar menor ou igual ao disponível na conta
        c1.PagarMensalidade();//Testa pagar a mensalidade sem saldo suficiente na conta
        c1.FecharConta();//Testa fechar a conta no modo CC
        Conta c2 = new Conta();//Cria uma segunda conta
        c2.AbrirConta(2,"CP","Joao Silva");//Abre a conta no modo CP
        c2.PagarMensalidade();//Testa pagar a mensalidade na conta no modo CP
        c2.Sacar(130);
        c2.PagarMensalidade();//Tenta pagar a mensalidade sem saldo
        c2.FecharConta();//Fecha a conta no modo CP
        
    }
}

class Conta{
    public int  numConta; //
    protected String tipoConta; // 
    private String titularConta;
    private double saldo;
    private boolean status;


    public Conta(){
        this.setSaldo(0);
        this.setStatus(false);
    }


    public void setNumConta(int numeroConta){
        this.numConta = numeroConta;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    
    public String getTipoConta(){
        return this.tipoConta;
    }
    
    public void setTitularConta(String nomeTitular){
        this.titularConta = nomeTitular;
    }
    
    public String getTitularConta(){
        return this.titularConta;
    }
    
    public void setSaldo(double saldo){
        this.saldo += saldo ;
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean status){
        this.status = (status);
    }

    public boolean getStatus(){
        return this.status;
    }

    public void AbrirConta(int numeroConta, String tipoConta, String nomeTitular) {
        if(this.status == true){
            System.out.println("Atenção: Essa conta já esta aberta! \n\n");
        }

        if(this.status == false){
            this.setNumConta(numeroConta);
            this.setTipoConta(tipoConta);
            this.setTitularConta(nomeTitular);
            this.setStatus(true);

            if(this.tipoConta ==  "CC" || this.tipoConta == "cc"){
                this.setSaldo(50);
              }

            if(this.tipoConta == "CP" ||  this.tipoConta == "cp"){
                this.setSaldo(150);
            }
            System.out.println("Conta: " + this.numConta + " aberta com sucesso!\n" + "Titular da conta: " + this.titularConta + "\nSaldo da conta: R$" + this.saldo + "\n");
        }
    }

    public void FecharConta(){

        if(this.status ==  false){
            System.out.println("Atenção: Impossivel fechar a Conta pois ela ja esta fechada!\n");
        }

        if(this.status == true){
            if(this.saldo > 0){
                System.out.println("Atenção: Impossivel fechar a Conta: " + this.numConta + " pois ela nao esta zerada!\n" + "Titular da conta: " + this.titularConta + "\nSaldo da conta: R$" + this.saldo + "\n");
            }
    
            if(this.saldo == 0){
                this.setStatus(false);
                System.out.println("Conta: " + this.numConta + " foi fechada com sucesso!\n" + "Titular da conta: " + this.titularConta + "\nSaldo da conta: R$" + this.saldo + "\n");
            }
        }
    }

    public void Depositar(double valor){
        if (this.status == false){
            System.out.println("Atenção: Impossivel realizar o deposito pois a conta não está ativa!\n");
        }

        if(this.status == true){
            this.setSaldo(+valor);
            System.out.printf("Deposito de: R$" + valor + " na conta: " + this.numConta + "\nTitular da conta: " + this.titularConta + "\nSaldo da conta: R$" + this.saldo + "\n");

        }
    }

    public void Sacar(double valor){

        if(this.status == false){
            System.out.println("Atenção: Impossivel realizar o saque pois a conta não está ativa!\n");
        }

        if(this.status == true){

            if(this.saldo < valor){
                System.out.println("\nSaldo insuficiente para o saque!\nConta: "+ this.numConta + "\nTitular da conta: " + this.titularConta + "\nSaldo da conta: R$" + this.saldo + "\n");
            }

            if(this.saldo >= valor){
                this.setSaldo(-valor);
                System.out.printf("Saque de: R$" + valor + " da conta: " + this.numConta + "\nTitular da conta: " + this.titularConta + "\nSaldo da conta: R$" + this.saldo + "\n\n");
            }
        }
    }

    public void PagarMensalidade(){
        if(this.status == false){
            System.out.println("Atenção: Impossivel realizar o pagamento da mensalidade pois a conta não está ativa!\n");
        }

        if(this.status == true){
            if(this.tipoConta == "cc" || this.tipoConta == "CC"){
                if(this.saldo < 12){
                    System.out.println("Atenção: Impossivel realizar o pagamento da mensalidade pois a conta não tem saldo suficiente!\n");
                }
                if(this.saldo >=12){
                    this.setSaldo(- 12);
                    System.out.println("\nMensalidade paga com sucesso! \nSaldo atual: R$" + this.saldo + "\n");
                }
            }
            if(this.tipoConta == "cp" || this.tipoConta == "CP"){
                if(this.saldo < 20){
                    System.out.println("Atenção: Impossivel realizar o pagamento da mensalidade pois a conta não tem saldo suficiente!\n");
                }
                if(this.saldo >=20){
                    this.setSaldo(- 20);
                    System.out.println("\nMensalidade paga com sucesso! \nSaldo atual: R$" + this.saldo + "\n");
                }
            }    
        }
    }
}
