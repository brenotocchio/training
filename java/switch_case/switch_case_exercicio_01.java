package switch_case;

import java.util.Scanner;

public class switch_case_exercicio_01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana que você está: ");
        System.out.println(" 1- Domingo / 2- Segunda....");

        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Você está no Domingo.");
                break;
            case 2:
                System.out.println("Você está na Segunda Feira.");
                break;
            case 3:
                System.out.println("Você está na Terça Feira.");
                break;
            case 4:
                System.out.println("Você está na Quarta feira");
                break;
            case 5:
                System.out.println("Você está na Quinta Feira");
                break;
            case 6:
                System.out.println("Você está na Sexta Feira.");
                break;
            case 7:
                System.out.println("Você está no Sábado.");
                break;
            default:
                System.out.println("Número inválido. Digite um número entre 1 e 7.");
                break;
        }

        entrada.close();

    }

}
