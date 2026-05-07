package vetores_array;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        int pares = 0;

        for(int i = 0; i < 10; i++){

            System.out.println("Digite o número " + (i + 1) + ": ");

            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                
                pares++;

            }

        }

        System.out.println("Quantidade de números pares: " + pares);

        scanner.close();

    }

}
