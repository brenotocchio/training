package treinos;

import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

            double saldo = 1000;

            while(true){

                System.out.println("1- Ver saldo");
                System.out.println("2- Depositar dinheiro");
                System.out.println("3- Sacar dinheiro");
                System.out.println("4- Sair");

                int choose = entrada.nextInt();

                switch (choose) {
                    case 1:

                        System.out.println("Saldo atual: " + saldo + "\n");
                        continue;
                    
                    case 2:
                        System.out.println("Digite quanto você deseja depositar: ");
                        double deposit = entrada.nextDouble();

                        saldo+= deposit;
                        System.out.println("\n");
                        continue;

                    case 3:
                        System.out.println("Digite quanto você deseja sacar: ");
                        double saque = entrada.nextDouble();

                        if (saque > saldo) {
                            System.out.println("Você não tem saldo suficiente para sacar\n");
                        }
                        else
                            saldo-= saque;
                            continue;

                    case 4:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inexistente.");
                        break;
                    
            }

            entrada.close();

        }
    }
}
