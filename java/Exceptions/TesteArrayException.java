package Exceptions;

public class TesteArrayException {
    public static void main(String[] args) {
        
        try {

            int[] numeros = {1, 2, 3}; // índices 0, 1, 2 //

            System.out.println(numeros[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Programa finalizado com ou sem problemas!");
            
        }

    }
}
