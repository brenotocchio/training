package herança;

class Funcionario {
    private String nome;
    private double salario;

    

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
    

    void addAumento(double valor){
        salario += valor;
    }

    void ganhoAnual(){

    }

}

class Assistente extends Funcionario{

    void ganhoAnual(){
        
    }

}

public class ExercicioHeranca {
    public static void main(String[] args) {
        
        Assistente assistente = new Assistente();

        assistente.setNome("João");
        assistente.setSalario(3000);
        assistente.addAumento(500);

        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário: " + assistente.getSalario());

    }
}