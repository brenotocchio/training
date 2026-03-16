package switch_case;

import java.util.Scanner;

public class switch_case_exercicio_02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma operação a realizar-");
        System.out.println("| '+' | '-' | '*' | '/'|");
        char choose = entrada.next().charAt(0);
        entrada.nextLine();

        System.out.println("Escolha o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Escolha o segundo número: ");
        double num2 = entrada.nextDouble();
        
        switch (choose) {
            case '+':
                System.out.println("O resultado da soma dos dois número é: " + (num1 + num2));
                break;
            
            case '-':
                System.out.println("O resultado da subtração dos dois número é: " + (num1 - num2));
                break;
            case '*': 
                System.out.println("O resultado da multiplicação dos dois número é: " + (num1 * num2));
                break;
            case '/':
                System.out.println("O resultado da divisão dos dois número é: " + (num1 / num2));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }


        entrada.close();

    }
}
