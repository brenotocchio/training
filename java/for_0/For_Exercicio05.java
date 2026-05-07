package for_0;
import java.util.Arrays; // Transformar texto em lista
import java.util.List; // Lista de elementos
import java.util.Scanner;

public class For_Exercicio05 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira palavras separadas por vírgula: ");

        String linhaDigitada = entrada.nextLine(); // Guardar String na variável "linhaDigitada"

        List<String> palavras = Arrays.asList(linhaDigitada.split(",")); 
        //Criar   | Nome da    | Transformar      | Variavel  | Separe 
        //Lista   | Variável   | em Listas        | que Guarda| tudo por
        //String  | da Lista   | tudo que inserir | Os valores| vírgula

        System.out.println("\n");

        for(String palavra : palavras){ // Para cada palavra dentro da lista palavras

            palavra = palavra.trim(); // .trim remove espaços antes e depois do texto

            if (palavra.length() > 4) { // .length conta quantas letras a palavra tem
                
                System.out.println(palavra);

            }

        }

        entrada.close();

    }
}
