package while_01;

import java.util.Scanner;

public class While_Exercicio_10 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int contador;

        System.out.println("Digite um número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int num2 = entrada.nextInt();

        System.out.println();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Contagem do menor para maior: ");

            if (num1 < num2) {
                contador = num1 + 1;

                while (contador < num2) {
                    System.out.println(contador);
                    contador++;
                }

            } else {
                contador = num2 + 1;

                while (contador < num1) {
                    System.out.println(contador);
                    contador++;
                }
            }
        }

        entrada.close();
    }
}