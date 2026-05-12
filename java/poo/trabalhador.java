package poo;

//Código com class folhaDePagamento ! ! !

public class trabalhador {
    
    private String nome;
    public double salario;

    public trabalhador(String nomeInit, double salarioInit){
        nome = nomeInit;
        salario = salarioInit;
    }

    public String obterinfo() {
        return "Nome: " + nome + ", Salário: " + salario;
    }

    public void aumentarSalario(double aumento){
        salario += aumento;
    }

    public void aumentarSalario(int porcentagem) {
    salario += salario * porcentagem / 100.0;
    }

}
