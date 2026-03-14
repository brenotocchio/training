package funcao_if;

import java.util.Scanner;

public class IF_Exercicio_05 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0){
            System.out.println("O número digitado é múltiplo de 3 e 5 ao mesmo tempo.");
        }

        else{
            System.out.println("número digitado não é múltiplo de 3 e 5 ao mesmo tempo.");
        }

        entrada.close();

    }
}
