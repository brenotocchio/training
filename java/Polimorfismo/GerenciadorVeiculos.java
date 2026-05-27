package Polimorfismo;

abstract class Veiculo {

    String placa;
    int ano;

    Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    void exibirInformacoes(){
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }

}

class Onibus extends Veiculo{

    int assentos;
    
    Onibus(String placa, int ano, int assentos){
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Quantidade assentos: " + assentos);
    }

}

class Caminhao extends Veiculo{

    int eixos;

    Caminhao(String placa, int ano, int eixos){
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Quantidade eixos: " + eixos);
    }

}

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        
        Onibus onibus = new Onibus("ABC123", 2010, 10);
        Caminhao caminhao = new Caminhao("CBA321", 2015, 4);

        onibus.exibirInformacoes();
        System.out.println();
        caminhao.exibirInformacoes();

    }
}