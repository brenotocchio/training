package funcao_if;

import java.util.Scanner;

public class IF_Exercicio_08 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2)/2;

        if (media >= 7){
            System.out.println("Aprovado");
            System.out.println("Aprovado com a média " + media);
        }
        else if (media >= 5 && media <= 6){
            System.out.println("Recuperação");
            System.out.println("Recuperação com a média " + media);
        }
        else{
            System.out.println("Reprovado");
            System.out.println("Reprovado com a média " + media);
        }

        entrada.close();

    }

}