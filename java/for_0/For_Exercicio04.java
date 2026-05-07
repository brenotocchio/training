package for_0;
import java.util.Scanner;

public class For_Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cálculo da Média de 10 Números: \n");

        int soma = 0;

        for ( int i = 1; i<=10; i++){

            System.out.println("Digite o " + i + " número: ");
            int numero = entrada.nextInt();

            soma += numero;

        }

        System.out.println("A média dos números inseridos é de: " + (double)soma/10);

        entrada.close();

    }
}
