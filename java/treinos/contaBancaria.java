package treinos;

//Código com class Banco ! ! !

public class contaBancaria {

    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    // Construtores

    public contaBancaria(String numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    // Get & Set

    public String getNumero(){
        return numeroConta;
    }

    public void setNumero(String numeroConta){
        this.numeroConta = numeroConta;
    }

    //

    public String getNome(){
        return nomeTitular;
    }

    public void setNome(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    //

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    // Métodos de Negócio

    public void depositar(double valor){

        if (valor <= 0) {
            System.out.println("Número inválido para depósito");
            return;
        }
        else{
            saldo += valor;
        }
    }

    public void sacar(double valor){

        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
        }
        else{
            saldo -= valor;
        }

    }

    public boolean transferir(contaBancaria destino, double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
            return false;
        }

        if(this.saldo < valor){
            System.out.println("Saldo insuficiente para realizar a transferência.");
            return false;
        }

        this.saldo -= valor;
        destino.saldo += valor;
        return true;
    }

    public String exibirDados() {
    return "Número da conta: " + getNumero() + "\nNome do titular: " + getNome() + "\nSaldo atual: " + getSaldo();
}

}
