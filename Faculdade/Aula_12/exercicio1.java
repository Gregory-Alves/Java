package Aula_12;

public class exercicio1 {
    public static void main(String[] args) {
        Time barcelona = new Time("Barcelona");
        Time psg = new Time ("PSG");

        Jogador neymar = new Jogador("Neymar", "Atacante");
        Jogador mbappe = new Jogador("Mbappé", "Atacante");
        Jogador messi = new Jogador("Messi", "Meia");
        Jogador raphinha = new Jogador("raphinha", "Ponta");

        barcelona.adicionarJogador(raphinha);
        barcelona.adicionarJogador(messi);
        barcelona.adicionarJogador(neymar);
        psg.adicionarJogador(mbappe);
        psg.adicionarJogador(messi);
        psg.adicionarJogador(neymar);

        barcelona.mostrarJogadores();
        psg.mostrarJogadores();
    }
}

class Jogador{
    private String nome;
    private String posicao;

    public Jogador(String nome, String posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome(){
        return this.nome;
    }

    public String getPosicao(){
        return this.posicao;
    }
}

class Time{
    private String nome;
    private Jogador[] jogadores;
    private int numJogadores;

    public Time(String nome){
        this.nome = nome;
        this.jogadores = new Jogador[10];
        this.numJogadores = 0;
    }

    public void adicionarJogador(Jogador jogador){
        if(numJogadores < 11){
            jogadores[numJogadores] = jogador;
            numJogadores++;
        }
    }

    public void mostrarJogadores(){
        System.out.println("Time " + nome + ":\n");
        for(int i=0; i<numJogadores; i++){
            System.out.println(jogadores[i].getNome() + " - " + jogadores[i].getPosicao());
        }
        System.out.println("");
    }
}