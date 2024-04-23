package aula_7;

class exercicio4 {
    public static void main(String[] args){

        Jogador p1 = new Jogador();
        p1.nome = "Dinho";
        p1.pontuacao = 100;
        p1.nivel = 1;

        p1.status();
        p1.aumentarPontuacao(1200);
        p1.status();
    }
}

class Jogador{
    String nome;
    int pontuacao;
    int nivel;
    int xpp = 1000;

    public void status(){
        System.out.println("Esse é o nickname do player: " + this.nome);
        System.out.println("A Pontuação atual do player é de: " + this.pontuacao);
        System.out.println("O nível da conta do player é: " + this.nivel + "\n\n");
    }

    public void aumentarPontuacao(int pontos){
        this.pontuacao+=pontos;

        if (this.pontuacao<1000){
            xpp=1000;
            System.out.printf("Voce ganhou " + pontos + " de xp e agora falta " + (xpp-this.pontuacao) + "para upar de nivel! \n\n");
        }
        
        if (this.pontuacao>= 1000){
            this.nivel++;
            this.pontuacao-=1000;
            System.out.println("Parabéns! Você alcançou 1000 pontos de xp e ganhou um novo nível!");
            System.out.printf("O seu nivel agora é " + this.nivel + " e agora voce tem " + this.pontuacao + " pontos de xp! \n\n");
            
        }
    }

    public void aumentarNivel(int nvl){
        this.nivel+=nvl;
        System.out.printf("Seu nivel agora é: " +  this.nivel+"\n");
    }
}
