package switch_case;

import java.util.Scanner;

public class switch_case_exemplo_01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha uma cor: ");
        System.out.println("1- Azul");
        System.out.println("2- Verde");
        System.out.println("3- Vermelho");

        int choose = entrada.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Você escolheu a cor azul.");
                break;
        
            case 2:
                System.out.println("Você escolheu a cor verde.");
                break;
            case 3:
                System.out.println("Você escolheu a cor vermelha.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        entrada.close();

    }
}
