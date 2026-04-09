package do_while;
import java.util.Scanner;

public class do_while_exercicio3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;
        int numero;

        do {
            
            System.out.println("Digite um número (-1 para sair): ");

            numero = entrada.nextInt();

            if(numero != -1){

                soma+= numero;
                quantidade++;

            }

        } while (numero != -1);

        if (quantidade > 0) {
            
            double media = (double) soma / quantidade;

            System.out.println("Media " + media);

        }

        else{
            System.out.println("Nenhum número válido digitado.");
        }   

        entrada.close();

    }
}
