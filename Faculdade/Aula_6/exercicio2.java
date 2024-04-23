package Aula_6;
class exercicio2 {
    public static void  main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.nome = "Marcelo";
        p1.idade = 15;
        p1.peso = 50.7;
        p1.altura = 1.75;

        p1.status();
        p1.envelhecer();
        p1.engordar(1.3);
        p1.status();
        p1.emagrecer(2.0);
        p1.status();
    }
}

class Pessoa{
    String  nome;
    int idade;
    double peso;
    double altura;

    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura + "\n");
    }

    public void envelhecer(){
        if(idade < 21){
            this.idade++;
            this.altura+=0.01;
        }
        if(idade>=21){
            this.idade++;
        } 
    }

    public void engordar(double kgs){
        this.peso += kgs;
    }

    public void emagrecer(double kgs){
        this.peso -= kgs;
    }
}

// Classes 
// Nome
// Idade
// Peso
// Altura

// Metodos
// Envelhecer - Um ano por vez (If idade < 21 {Crescer 1cm})
// Engordar - Informar a quantidade de KGs 
// Emagrecer - Informar a quantidade de KGs