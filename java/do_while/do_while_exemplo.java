package do_while;
import java.util.Scanner;

public class do_while_exemplo {
    public static void main(String[] args) {
        
        System.out.println("\n Exemplo 1- Contar de 1 a 5 com do-while\n");

        int contador = 1;

        // Do - Fazer
        do {

            System.out.println("Contando: " + contador);

            contador ++;

        // Enquanto
        } while (contador <= 5);

        // EXEMPLO 2

        System.out.println("\n Exemplo 2- Menu simples que repete até o usuário digitar 0\n");

        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {
            
            System.out.println("\n==== Menu ====");
            System.out.println("1- Opção 1");
            System.out.println("2- Opção 2");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opção: ");

            opcao = entrada.nextInt();

            if(opcao == 1){

                System.out.println("Você escolheu a opção 1.");

            }
            else if(opcao == 2){

                System.out.println("Você escolheu a opção 2.");

            }
            else if(opcao != 0){

                System.out.println("Opção inválida. Tente novamente");

            }


        } while (opcao != 0);

        System.out.println("Programa finalizado.");

        // EXEMPLO 3

        System.out.println("\n Exemplo 3- Validar entrada até o usuário digitar número positivo.\n");
    
        Scanner entrada2 = new Scanner(System.in);

        int numero;

        do {
            
            System.out.println("Digite um número positivo: ");

            numero = entrada2.nextInt();

            if (numero < 0) {
                System.out.println("Número inválido! Tente novamente.");
            }

        } while (numero < 0);

        System.out.println("Número aceito: " + numero);

        entrada.close();
        entrada2.close();

    }

}
