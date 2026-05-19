package herança;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

class Estudante extends Pessoa {
    int matricula;

    Estudante(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }
}

public class Escola {
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante("Breno", 18, 01);

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Matricula: " + estudante.matricula);

    }
}