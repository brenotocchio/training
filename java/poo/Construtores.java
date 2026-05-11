package poo;

public class Construtores {
    
    String nome;
    String cargo;
    int idade;

    Construtores(String nomeInit, String cargoInit, int idadeInit){

        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;

    }

    public static void main(String[] args) {

        Construtores construtores = new Construtores("Maria", "Gerente", 50);
        
        System.out.println("Nome: " + construtores.nome);
        System.out.println("Cargo: " + construtores.cargo);
        System.out.println("Idade: " + construtores.idade);

    }


}
