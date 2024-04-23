package aula_7;

class exercicio6 {
    public static void main(String[] args){
        Lampada l1 = new Lampada();
        l1.ligada = false;
        l1.quebrada = false;
        l1.cont = 0;

        l1.status();
        l1.acender();
        l1.quebrar();
        l1.status();
    }
}

class Lampada{
    boolean ligada = false;
    boolean quebrada = false;
    int cont;

    public void status(){
        if(this.quebrada == false){
            if(this.ligada == true){
                System.out.println("A lampada esta LIGADA! \n\n");
                System.out.println("A lampada ja foi ligada " + this.cont + " vezes! \n\n");
            }

            if(this.ligada == false){
                System.out.println("A lampada esta DESLIGADA! \n\n");
            }
        }

        if(this.quebrada == true){
            System.out.println("A lampada esta QUEBRADA! \n\n");
        }
    }

    public void acender(){
        if(this.quebrada == false){
            if(this.ligada == true){
                System.out.println("Essa lampada ja esta LIGADA!\n\n");
            }

            if(this.ligada == false){
                this.cont++;
                this.ligada = true;
                System.out.println("A lampada foi Ligada! \n\n");
            }
        }

        if(this.quebrada == true){
            System.out.println("A lampada nao pode ligar pois esta quebrada! \n\n");
        }
    }

    public void apagar(){
        if(this.quebrada == false){
            if(this.ligada == false){
                System.out.println("Essa lampada ja esta DESLIGADA!\n\n");
            }

            if(this.ligada == true){
                this.ligada = false;
                System.out.println("Lampada Apagada!\n\n");
            }
        }

        if(this.quebrada == true){
            System.out.println("Nao e possivel apagar a lampada, pois ela esta quebrada!\n\n");
        }
    }

    public void quebrar(){
        this.ligada = false;
        this.quebrada = true;
        System.out.println("A lampada foi quebrada!\n\n"); 
    }

    public void  reparar(){
        if(this.quebrada == false){
            System.out.println("Impossivel reparar a lampada pois ela nao esta quebrada!!\n\n");
        }

        if(this.quebrada == true){
            this.quebrada = false;
            this.cont = 0;
            System.out.println("A lampada foi reparada com sucesso! e a sua contagem de quantas vezes ela foi ligada foi zerada!!\n\n");
        }
    }
}
