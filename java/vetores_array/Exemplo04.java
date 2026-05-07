package vetores_array;

public class Exemplo04 {
    public static void main(String[] args) {
        
        int[] vetor = {7, 3, 5, 7, 2, 7, 8, 7, 6};

        int contador = 0;

        for(int valor : vetor){

            if (valor == 7) {
                contador++;
            }
        }

        System.out.println("O número 7 aparece " + contador + " vezes");
    }
}
