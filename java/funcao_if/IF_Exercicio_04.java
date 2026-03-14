package funcao_if;

import java.util.Scanner;

public class IF_Exercicio_04 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero >= 10 && numero <=100){
            System.out.println("O número é valido.");
        }
        else{
            System.out.println("O número é invalido.");
        }
    }

}
