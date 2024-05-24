package Aula_14.exercicios;
import java.util.ArrayList;
import java.util.List;
 
class Main {
    public static void main(String[] args) {
        /* Criando a frota de veiculos */
        List<Veiculo> frota = new ArrayList<>();
 
        /* Adicionando veiculos a frota */
        Carro carro = new Carro("Vw", "Gol", 2020, 20, 13.3);
        Moto moto = new Moto("Honda", "CG", 2021, 50, 32);
 
        frota.add(carro);
        frota.add(moto);
        
        moto.acelerar();
        moto.frear();
 
        /* Realizando uma viagem com um veiculo da frota */
        moto.realizarViagem(100);
 
        /* Listando os veiculos da frota */
        System.out.println("\nVeiculos na lista:");
        for (Veiculo veiculo : frota) {
            veiculo.imprimirDetalhes();
        }
 
        /* Removendo um veiculo da lista */
        frota.remove(carro);
    }
}
 
/* Classe Veiculo (superclasse) */
class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double combustivel;
    private double consumoMedio;
 
    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
    }
 
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
 
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
 
    public double getCombustivel() {
        return combustivel;
    }
 
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
 
    public double getConsumoMedio() {
        return consumoMedio;
    }
 
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
 
    public double calcularAutonomia() {
        return combustivel * consumoMedio;
    }
 
    public boolean precisaAbastecimento() {
        return calcularAutonomia() < 30;
    }
 
    public void realizarViagem(double distancia) {
        double combustivelConsumido = distancia / consumoMedio;
        if (combustivelConsumido <= combustivel) {
            combustivel -= combustivelConsumido;
            System.out.println("Viagem realizada com sucesso. Combustivel restante: " + combustivel + " litros");
        } else {
            System.out.println("Nao ha combustivel suficiente para realizar a viagem.");
        }
    }
 
    public void imprimirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricacao: " + anoFabricacao);
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
        System.out.println("Precisa de abastecimento? " + (precisaAbastecimento() ? "Sim" : "Nao"));
        System.out.println();
    }
}
 
/* Classe Carro (subclasse) */
class Carro extends Veiculo {
    public Carro(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
    }
 
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }
 
    public void frear() {
        System.out.println("Carro freando...");
    }
}
 
/* Classe Moto (subclasse) */
class Moto extends Veiculo {
    public Moto(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
    }
 
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }
 
    public void frear() {
        System.out.println("Moto freando...");
    }
}