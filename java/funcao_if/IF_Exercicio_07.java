package funcao_if;

import java.util.Scanner;

public class IF_Exercicio_07 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("====Verifique se um ano é bissexto====");
        System.out.println("Digite o ano que deseja saber: ");
        int ano = entrada.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println("Ano é bissexto.");
        }
        else{
            System.out.println("Ano não é bissexto.");
        }
        
        entrada.close();

    }
}
