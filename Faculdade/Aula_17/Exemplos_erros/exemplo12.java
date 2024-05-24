package Aula_17.Exemplos_erros;
//as regras de negócios são tratadas dentro da classe principal (main), o que não é considerado uma boa prática.
class Exemplo {
    public static void main(String[] args) {
        
        /* Regras de negocio: entrada de pelo menos, 20% do valor total e numero minimo de parcelas igual a 6 */ 
        
        double valorTotal = 1000;
        double entrada = 100;
        int parcelas = 10;
        
        if(entrada < valorTotal * 0.2){
            System.out.println("A entrada deve ser de pelo menos 20%");
        }
        else if(parcelas < 6){
            System.out.println("O numero minimo de parcelas e 6");
        }
        else{
            Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(f.prestacao());
        }
    }
}
 
class Financiamento{
    public double valorTotal;
    public double entrada;
    public int parcelas;
    
    public Financiamento(double valorTotal, double entrada, int parcelas){
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }
    
    public double prestacao(){
        return (valorTotal - entrada) / parcelas;
    }
}
