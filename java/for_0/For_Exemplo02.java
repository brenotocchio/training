package for_0;

import java.util.Arrays;

import java.util.List;

import java.util.Scanner;

public class For_Exemplo02 {
    public static void main(String[] args) {
        
        List<String> lista = Arrays.asList("A", "B", "C", "D", "E");

        for (String item : lista) {

            System.out.println(item);

            if (item.matches("C")) {
                
                break;

            }

        }

        System.out.println();

        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja");

        for (String fruta : frutas) {

            System.out.println(fruta);

        }

        System.out.println();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numeroDigitado = entrada.nextInt();

        for (int i = 1; i <= numeroDigitado; i++){

            System.out.println("Contador i: " + i);

        }

    }
}
