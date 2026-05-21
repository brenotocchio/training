package Interfaces01;

interface Veiculo{
    void iniciar();
    void parar();
    default void buzinar(){
        System.out.println("Bi bi!");
    }
}

class Carro implements Veiculo{

    public void iniciar(){
        System.out.println("Iniciando carro");
    }

    public void parar(){
        System.out.println("Parando carro");
    }

}

class Caminhao implements Veiculo{

    public void iniciar(){
        System.out.println("Iniciando caminhão");
    }

    public void parar(){
        System.out.println("Parando caminhão");
    }

}

public class Exercicio01 {

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();

        carro.iniciar();
        carro.buzinar();

        System.out.println();

        caminhao.iniciar();
        caminhao.buzinar();

    }
    
}