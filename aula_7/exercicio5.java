package aula_7;

class exercicio5 {
    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.marca = "BMW";
        c1.modelo = "M1";
        c1.ano = 2024;
        c1.velocidade_atual = 0;

        c1.status();
        c1.acelerar(250);
        c1.freiar(150);
        c1.freiar(100);
        c1.freiar(100);
        c1.status();
    }
}


class Carro{
    String marca;
    String modelo;
    int ano;
    double velocidade_atual;

    public void status(){
        System.out.println("Essa é a marca do carro " + this.marca);
        System.out.println("Esse é o modelo do carro " + this.modelo);
        System.out.println("O carro foi fabricado no ano de " +this.ano );
        System.out.println("Essa é a velocidade atual do carro: " + this.velocidade_atual + " km/h\n\n");
    }

    public void acelerar(double vel){
        if(this.velocidade_atual>=200){
            System.out.println("Impossivel acelerar mais pois o carro esta a 200km/h, e essa e a velocidade maxima permitida!\n\n");
        }

        if(this.velocidade_atual <200){
            this.velocidade_atual +=vel;
            if(this.velocidade_atual<200){
                System.out.println("A sua velocidade atual agora é: " + this.velocidade_atual + "\n\n");
            }

            if(this.velocidade_atual>=200){
                this.velocidade_atual=200;
                System.out.println("Voce acelerou ate chegar na velocidade maxima! Sua velocidade atual é: " + this.velocidade_atual + "\n\n");
            }
        }
    }

    public void freiar(double vel){
        if(this.velocidade_atual==0){
            System.out.println("Impossivel freiar mais pois o carro ja esta parado!\n\n");
        }

        if(this.velocidade_atual>0){
            this.velocidade_atual-=vel;
            if(this.velocidade_atual<0) {
                this.velocidade_atual=0;
                System.out.println("Voce freiou ate o carro parar! \n\n");
        }

            if(this.velocidade_atual>0){
                System.out.println("Voce freiou: " + vel + " Km/h e agora a sua velocidade é: " + this.velocidade_atual + " km/h! \n\n");
            }
        }
    }
}
