package funcao_if;

import java.util.Scanner;

public class IF_Exercicio_02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número intero: ");
        int numero = entrada.nextInt();

        int result = (numero % 2);

        if (result == 0) {
            System.out.println("O número é par.");
        }

        else{
            System.out.println("O número é impar.");
        }

        entrada.close();

    }
}
