package poo;

public class Bolo {
    
    int quantidadedeAcucar;

    public static void main(String[] args) {
        
        Bolo bolodeChocolate = new Bolo();

        bolodeChocolate.quantidadedeAcucar = 200;

        Bolo bolodeBaunilha = new Bolo();

        bolodeBaunilha.quantidadedeAcucar = 150;

        System.out.println("Quantidade de açúcar no bolo de chocolate: " + bolodeChocolate.quantidadedeAcucar);

        System.out.println("Quantidade de açúcar no bolo de Baunilha: " + bolodeBaunilha.quantidadedeAcucar);

    }

}
