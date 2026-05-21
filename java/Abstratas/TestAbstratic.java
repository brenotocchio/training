package Abstratas;

abstract class carro {

    abstract void acelerar();

    void frear(){
        System.out.println("O carro está freando...");
    }

}

class CarroF1 extends carro {
    void acelerar(){
        System.out.println("O carro de Fórmula 1 está acelerando muito rapidamente...");
    }
}

class Caminhao extends carro {
    void acelerar(){
        System.out.println("O caminhão está acelerando lentamente...");
    }
}

public class TestAbstratic {

    public static void main(String[] args) {
        
        CarroF1 carrof1 = new CarroF1();
        Caminhao caminhao = new Caminhao();

        carrof1.acelerar();
        carrof1.frear();

        System.out.println();

        caminhao.acelerar();
        caminhao.frear();

    }

}