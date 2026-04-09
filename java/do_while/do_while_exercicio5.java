package do_while;
import java.util.Scanner;

public class do_while_exercicio5 {
 public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    int senha = 1234;
    int tentativa;

    do {
        
        System.out.println("Digite a senha: ");
        tentativa = entrada.nextInt();

        if (tentativa != senha) {
            System.out.println("Senha incorreta, tente novamente! \n");
        }

    } while (tentativa != senha);

    System.out.println("Senha correta!");

    entrada.close();

 }   
}
