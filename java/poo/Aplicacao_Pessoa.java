package poo;

class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    String telefone;

    public Pessoa(String nome, int idade, String endereco, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

}

public class Aplicacao_Pessoa {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João", 18, "Rua A, 123", "1234-5678");

        // NOME

        System.out.println("Nome: " + pessoa.nome);
        System.out.println();

        // IDADE

        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.setIdade(20);

        System.out.println("Nova idade: " + pessoa.getIdade());
        System.out.println();

        // ENDEREÇO

        System.out.println("Endereço: " + pessoa.getEndereco());

        pessoa.setEndereco("Rua Suma Itinose, 764");

        System.out.println("Novo endereço: " + pessoa.getEndereco());
        System.out.println();

        // TELEFONE

        System.out.println("Telefone: " + pessoa.getTelefone());

        pessoa.setTelefone("8765-4321");

        System.out.println("Novo telefone: " + pessoa.getTelefone());
        System.out.println();

    }

}