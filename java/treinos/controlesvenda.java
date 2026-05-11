package treinos;
import java.util.Scanner;

public class controlesvenda {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double[] vendas = new double[7];

        for(int i = 0; i<vendas.length; i++){

            System.out.print("Digite o valor do dia " + (i + 1) + ": ");
            vendas[i] = entrada.nextDouble();

        }

        System.out.println("\n");
        double vendatotal = 0;

        for(int i = 0; i<vendas.length; i++){

            System.out.println("Venda do dia " + (i + 1) + ": " + vendas[i]);

            vendatotal += vendas[i];

        }

        System.out.println("O valor total das vendas foram de " + vendatotal + " reais.\n");


        double media = vendatotal/vendas.length;

        System.out.printf("A média de vendas é de: %.2f%n", media);
        System.out.println("\n");

        double maior = vendas[0];
        double menor = vendas[0];
        int diamaior = 0;
        int diamenor = 0;

        for(int i = 0; i<vendas.length; i++){

            if (vendas[i] > maior) {

                maior = vendas[i];
                diamaior = i;
                
            }

            if (vendas[i] < menor) {
                
                menor = vendas[i];
                diamenor = i;

            }

        }

        System.out.println("Dia da maior venda: " + (diamaior + 1)+ "\n");
        System.out.println("Dia da menor venda: " + (diamenor + 1)+ "\n");

        System.out.println("Maior venda R$" + maior + "\nMenor venda R$" + menor);

        entrada.close();

    }
}
