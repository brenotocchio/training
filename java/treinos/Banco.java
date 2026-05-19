package treinos;

//Código com class contaBancaria ! ! !

public class Banco {
    public static void main(String[] args) {
        
        contaBancaria Conta1 = new contaBancaria("01","João", 1000);

        contaBancaria Conta2 = new contaBancaria("02", "Maria", 500);

        Conta1.depositar(200);

        Conta2.sacar(300);

        Conta1.transferir(Conta2, 400);

        System.out.println(Conta1.exibirDados());
        System.out.println();
        System.out.println(Conta2.exibirDados());

    }
}
