package while_01;

import java.util.Scanner;

public class While_Exercicio_07 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        while (true) {
         
            System.out.println("Digite a senha: ");
            int senha = entrada.nextInt();

            if(senha == 1234){
                System.out.println("Login efetuado com sucesso!");
                System.out.println("Encerrando sistema...");
                break;
            }
            else
                System.out.println("Senha incorreta, tente novamente!");
                continue;
        }

        entrada.close();

    }

}