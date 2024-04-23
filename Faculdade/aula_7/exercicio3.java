package aula_7;

class exercicio3 {
    public static void main(String[] args){
        Caneta caneta = new Caneta();
        caneta.marca = "Bic";
        caneta.cor  = "Azul";
        caneta.tampa = true;
        caneta.escrever = false;

        caneta.status();
        caneta.destampar();
        caneta.comecarEscrever();
        caneta.status();

        caneta.pararEscrever();
        caneta.status();
        caneta.tampar();
        caneta.comecarEscrever();
    }
}

class Caneta{
    String marca;
    String cor;
    boolean tampa = false;
    boolean escrever = false;

    public void tampar(){
        
        if(this.escrever == false){
            
            if(this.tampa == true){
                System.out.println("A caneta ja esta tampada!\n ");
            }

            if(this.tampa == false){
                this.tampa=true;
                System.out.println("A caneta foi tampada\n");
            }
        }

        if (this.escrever == true){
            System.out.println("Pare de escrever com a caneta antes de tampar ela! \n");
        }
    }

    public void destampar(){
       
        if(this.tampa == false){
            System.out.println("A caneta ja esta destampada!\n ");
        }
       
        if(this.tampa == true){
            this.tampa=false;
            System.out.println("A caneta foi destampada!\n");
        }
    }

    public void comecarEscrever(){

        if(this.tampa == false){

            if(this.escrever == true){
                System.out.println("Voce ja esta escrevendo com a caneta!\n");
            }

            if(this.escrever == false){
                this.escrever=true;
                System.out.println("Você comecou a escrever com a caneta!\n");
            }
        }

        if(this.tampa == true){
            System.out.println("Impossivel escrever com a caneta tampada!\n");
        }
    }

    public void pararEscrever(){

        if(this.escrever == false){
            System.out.println("Nao tem como parar, pois voce nao esta escrevendo agora!\n");
        }

        if(this.escrever == true){
            this.escrever = false;
            System.out.println("Voce parou de escrever!\n");
        }
    }

    public void status(){
        System.out.println("A marca da caneta é: " + this.marca);
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("A caneta esta com tampa: " + this.tampa);
        System.out.println("A caneta esta escrevendo: " + this.escrever + "\n");
    }
}