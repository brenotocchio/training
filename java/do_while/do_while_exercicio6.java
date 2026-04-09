package do_while;
import java.util.Scanner;

public class do_while_exercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int num = entrada.nextInt();

        int i = 1;

        do {
            
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;

        } while (i <= 10);

        entrada.close();

    }
}
