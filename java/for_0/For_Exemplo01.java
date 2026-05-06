package for_0;

public class For_Exemplo01 {
    public static void main(String[] args) {
        System.out.println("\nExemplo 1: Contar de 1 até 10\n");

        //Exemplo 1

        for (int i = 1; i <= 10; i++) {
            
            System.out.println("Valor de i: " + i);

        }

        //Exemplo 2

        System.out.println("\nExemplo 2: Contar de 10 até 1 (Ordem decrescente)\n");

        for (int i = 10; i >= 1; i--) {

            System.out.println("Valor de i: " + i);

        }

        //Exemplo 3

        System.out.println("\nExemplo 3: Mostrar apenas números pares de 2 a 20\n");

        for (int i = 2; i <= 20; i += 2) {

            System.out.println("Valor de i: " + i);
            
        }

        //Exemplo 4

        System.out.println("\nExemplo 4: Somar todos os números de 1 a 100\n");

        int soma = 0;

        for (int i = 1; i <=100; i++) {

            soma += i;

        }

        System.out.println("Soma: " + soma);

    }
}
