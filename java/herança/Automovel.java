package herança;

class Veiculo {
    
    void acelerar(){
        System.out.println("Veículo acelerando!");
    }

}

class Carro extends Veiculo {
    void acelerar(){
        super.acelerar();
        System.out.println("Carro acelerando!");
    }
}

public class Automovel {
    public static void main(String[] args) {
        
        Carro car = new Carro();

        car.acelerar();

    }
}