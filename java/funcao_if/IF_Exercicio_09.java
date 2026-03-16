package funcao_if;

import java.util.Scanner;

public class IF_Exercicio_09 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma letra: ");

        char letra = entrada.next().toLowerCase().charAt(0);

        if(letra == 'a'|| letra == 'e' || letra == 'i'|| letra == 'o' || letra == 'u'){
            System.out.println("A letra " + letra + " é vogal");
        }
        else{
            System.out.println("A letra " + letra + " é consoante");
        }

        entrada.close();

    }
}
