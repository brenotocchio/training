package while_01;

import java.util.Scanner;

public class While_Exercicio_05{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int contador = 0;
        int soma = 0;

        while (num != -1) {
            System.out.println("Digite um número inteiro para somar ou -1 para parar.");
            num = entrada.nextInt();

            if (num == -1){
                break;
            }

            soma += num;
            contador ++;

        }

        System.out.println("A soma dos valores foram de: " + soma + ", A quantidade de números utilizados foram de: " + contador);

        System.out.println("Programa encerrado.");

        entrada.close();

    }
}
