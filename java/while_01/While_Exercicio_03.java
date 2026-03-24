package while_01;
import java.util.Scanner;

public class While_Exercicio_03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int num = -1;

        while (num != 0) {
            System.out.println("Digite um número inteiro para continuar ou 0 para parar.");
            num = entrada.nextInt();
        }

        System.out.println("Programa encerrado.");

        entrada.close();

    }
}
