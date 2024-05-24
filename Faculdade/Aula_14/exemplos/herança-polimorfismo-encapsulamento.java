package Aula_14.exemplos;

class Main {
    public static void main(String[] args) {
        
        Animal meuGato = new Animal("Bu", 9);
        meuGato.mostrarInformacoes();
        
        Cachorro meuCachorro = new Cachorro("Rex", 3, "Labrador");
        meuCachorro.mostrarInformacoes();
    }
}
 
/* Classe base ou superclasse */
class Animal {
    String nome;
    int idade;
    
    /* Construtor da classe */
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    /* Getters e setters da classe */
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
 
    public void emitirSom() {
        System.out.println("Som generico de animal.");
    }
    
    /* Metodo para mostrar informacoes do animal - Exemplo de encapsulamento */
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
 
/* Classe derivada ou subclasse */
class Cachorro extends Animal {
    
    String raca;
    
    /* Construtor da classe Cachorro */
    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }
    
    /* Getters e setters */
    public String getRaca(){
        return raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    /* Sobrescrita do metodo emitirSom() da classe base - Exemplo de polimorfismo */
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
    
    /* Metodo para mostrar informacoes do cachorro, incluindo a raca -  Exemplo de encapsulamento */
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Raca: " + raca);
    }
}
