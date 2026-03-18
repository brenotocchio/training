package treinos;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra");

        String palavra = entrada.nextLine();

        System.out.println("Sua palavra foi: " + palavra);

        entrada.close();

    }
}
