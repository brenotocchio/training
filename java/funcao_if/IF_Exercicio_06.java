package funcao_if;

import java.util.Scanner;

public class IF_Exercicio_06 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo.");
        }
        else if (numero < 0){
            System.out.println("Número negativo.");
        }

        else{
            System.out.println("Número igual a zero.");
        }

        entrada.close();

    }
}
