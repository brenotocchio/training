package funcao_if;

import java.util.Scanner;

public class IF_Exercicio_01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = entrada.nextDouble();

        if(numero >= 0){
            System.out.println("O número é positivo.");
        }

        else{
            System.out.println("O número é negativo.");
        }

        entrada.close();

    }

}
