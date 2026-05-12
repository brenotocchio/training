package poo;

//Código com class Aplicacao ! ! !

public class Carro {
    
    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;

    Carro(){
        marcaDoCarro = "Desconhecida";
        modeloDoCarro = "Desconhecido";
        anoDoCarro = 0;
    }

    Carro (String marcaDoCarroInit, String modeloDoCarroInit){

        marcaDoCarro = marcaDoCarroInit;
        modeloDoCarro = modeloDoCarroInit;

    }

    Carro (String marcaDoCarroInit, String modeloDoCarroInit, int anoDoCarroInit){

        marcaDoCarro = marcaDoCarroInit;
        modeloDoCarro = modeloDoCarroInit;
        anoDoCarro = anoDoCarroInit;
    }

    public void exibirDetalhes(){

        System.out.println("Marca do carro: " + marcaDoCarro);
        System.out.println();
        System.out.println("Modelo do carro: " + modeloDoCarro);
        System.out.println();
        System.out.println("Ano do carro: " + anoDoCarro);
        System.out.println("----------------------------------------");

    }

}
