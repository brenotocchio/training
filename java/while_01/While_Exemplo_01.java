package while_01;

public class While_Exemplo_01 {
    
    public static void main(String[] args) {
        
        System.out.println("\n1. Contar de 1 até 5 com while\n");

        int contador = 1;

        while (contador <= 5) {
            
            System.out.println("Contador: " + contador);
            contador++;

        }

        System.out.println("\n2. Contagem regressiva de 5 até 1 com while\n");

        int contador2 = 5;

        while (contador2 >= 1) {
            System.out.println("Contador: " + contador2);
            contador2--;
        }

        System.out.println("\n3. Soma dos números de 1 até 10 com while\n");

        int soma = 0;
        int i = 1;

        while (i <= 10) {
            
            soma += i;

            i++;

        }

        System.out.println("A soma de 1 até 10 é: " + soma);

    }

}
