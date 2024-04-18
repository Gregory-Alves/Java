package Aula_6;

class exercicio3 {
    public static void  main(String[] args){
        Bomba b1 = new Bomba();
        b1.num_bomba = 1;
        b1.tipo_comb = "Gasolina";
        b1.valor_litro = 5.00;
        b1.quant_combust = 500;

        Bomba b2 = new Bomba();
        b2.num_bomba = 2;
        b2.tipo_comb = "Alcool";
        b2.valor_litro = 3.00;
        b2.quant_combust = 500;

        Bomba b3 = new Bomba();
        b3.num_bomba = 3;
        b3.tipo_comb = "Diesel";
        b3.valor_litro = 6.00;
        b3.quant_combust = 500;

        b1.status();
       //b1.abastecerPorValor(20);
        //b1.status();
       // b1.abastecerPorLitro(6);
       // b1.status();
       b1.alterarValor(6.0);
      // b1.abastecerPorLitro(5);
      //b1.alterarQuantidadeCombustivel(400);
      // b1.status();
    }
}

class Bomba{
    int num_bomba;
    String tipo_comb;
    double valor_litro;
    double quant_combust;
    double litros=0;
    double preco=0;

    public void status(){
        System.out.println("Numero da bomba: " + this.num_bomba);
        System.out.println("Esse e o tipo de combustivel da bomba: " + this.tipo_comb);
        System.out.println("Esse e o valor por litro: R$" + this.valor_litro);
        System.out.println("Essa e a quantidade de combustivel disponivel na bomba em LITROS: " + this.quant_combust + "\n");
    }

    public void abastecerPorValor(double preco){
        litros = preco/this.valor_litro;
        
        if(litros <=  this.quant_combust){
            this.quant_combust -= litros;
            System.out.printf("Foram abastecidos litros: " + litros + " e o valor foi: R$" + preco + "\n");
        }

        if(litros > this.quant_combust){
            System.out.println("Quantidade de gasolina solicitada e insuficiente na bomba");
        }
    }

    public void abastecerPorLitro(double litros){
        preco = valor_litro * litros;

        if(litros <=  this.quant_combust){
            this.quant_combust -= litros;
            System.out.printf("Foram abastecidos litros: " + litros + " e o valor foi: R$" + preco + "\n");
        }

        if(litros > this.quant_combust){
            System.out.println("Quantidade de gasolina solicitada insuficiente na bomba");
        }
    }

    public void alterarValor(double valor){
        
        if (valor > 0){
            this.valor_litro = valor;
            System.out.println("O novo valor do litro da bomba " + this.num_bomba +  " é: R$" + this.valor_litro);
        }
        if (valor ==0){
            System.out.println("E impossivel deixar o valor do combutivel zerado! ");
        }
    }

    public void alterarQuantidadeCombustivel(double combustivel){
        
        if(combustivel >=0){
            this.quant_combust = combustivel;
            System.out.println("A quantidade de combustível na bomba " + this.num_bomba + " agora é: " + this.quant_combust);
        }

        if(combustivel < 0){
            System.out.println("A quantidade de combustivel na bomba deve ser positivo!");
        }
    }
}