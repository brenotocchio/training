package do_while;
import java.util.Scanner;

public class do_while_exercicio4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int numero;

        do {
            
            System.out.println("Digite um número (0 para parar.)");
            numero = entrada.nextInt();

            if (numero != 0) {
                contador++;
            }
        
        } while (numero != 0);

        System.out.println("Foram digitados " + contador + " números.");

        entrada.close();

    }
}
