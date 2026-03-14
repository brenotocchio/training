package funcao_if;

import java.util.Scanner;

public class IF_Exercicio_03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número 1 inteiro: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o número 2 inteiro: ");
        int num2 = entrada.nextInt();

        if (num1 > num2){
            System.out.println("O número " + num1 + " é maior do que o número " + num2);
        }
        else if (num2 > num1){
            System.out.println("O número " + num2 + " é maior do que o número " + num1);
        }
        else{
            System.out.println("Os números são iguais.");
        }

        entrada.close();

    }

}
