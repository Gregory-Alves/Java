class prova {
    public static void main(String[] args) {
        Carro c1 = new Carro("Corsa", "Vermelho", "2006", 20);
        c1.mostrarInformacoes();
        c1.aumentarVelocidade();
        c1.aumentarVelocidade();
        c1.aumentarVelocidade();
        c1.diminuirVelocidade();
        c1.diminuirVelocidade();
        c1.diminuirVelocidade();
       
        Carro c2 = new Carro("Uno", "Azul", "2012", 180);
        c2.mostrarInformacoes();
        
    }
}
 
 
class Carro{
    private String modelo;
    private String cor;
    private String ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    
    public Carro(String modelo, String cor, String ano, int velocidadeMaxima){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getAno(){
        return this.ano;
    }
    
    public void setAno(String ano){
        this.ano = ano;
    }
    
    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    
    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }
    
    public void setVelocidadeAtual(int velocidadeAtual){
        this.velocidadeAtual += velocidadeAtual;
    }
    
    public void mostrarInformacoes(){
        System.out.println("\nModelo: " + getModelo() + "\nCor: " + getCor() + "\nAno: " + getAno() + "\nVelocidade Atual: "+ getVelocidadeAtual() + "km/h");
    }
    
    public void aumentarVelocidade(){
        if(getVelocidadeAtual() >= getVelocidadeMaxima()){
            System.out.println("\nO veiculo ja esta em sua velocidade maxima!");
        }
        
        if(getVelocidadeAtual() < getVelocidadeMaxima()){
            setVelocidadeAtual(10);
            System.out.println("\n\nA sua velocidade atual aumentou: " + getVelocidadeAtual() + "km/h");
        }
    }
    
    public void diminuirVelocidade(){
        if(getVelocidadeAtual() == 0){
            System.out.println("\nO veiculo ja esta parado! ");
        }
        
        if(getVelocidadeAtual() > 0){
            
            setVelocidadeAtual(-10);
            System.out.println("\n\nA velocidade atual diminuiu: " + getVelocidadeAtual() + "km/h");
        }
    }
}