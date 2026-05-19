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
    

    public void addAumento(double valor){
        salario += valor;
    }

    public double ganhoAnual(){
        return salario * 12;
    }

}

class Assistente extends Funcionario{
    
    public double ganhoAnual(){
        return super.ganhoAnual() + 1000;
    }

}

public class ExercicioHeranca {
    public static void main(String[] args) {
        
        Assistente assistente = new Assistente();

        assistente.setNome("Breno");
        assistente.setSalario(3000);
        assistente.addAumento(500);

        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário anual: " + assistente.ganhoAnual());

    }
}