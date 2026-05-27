package Polimorfismo;

interface Veiculo001 { // Interface
    void acelerar();
}

//SubClasse Carro
class Carro implements Veiculo001 {

    public void acelerar(){
        System.out.println("O carro está acelerando");
    }

}

//SubClasse Moto
class Moto implements Veiculo001 {

    public void acelerar(){
        System.out.println("A moto está acelerando");
    }

}

//Classe principal
public class TestPoliInterface {

    public static void main(String[] args) {
        
        // Criando Objetos Polimórficos usando Interface
        Veiculo001 carro = new Carro();
        Veiculo001 moto = new Moto();

        carro.acelerar(); // Imprime: O carro está acelerando
        moto.acelerar(); // Imprime: A moto está acelerando
        
    }

}