package arrays;

public class Array {
    public static void main(String[] args) {
        
        int[] meuArray; // Declaração de Array

        meuArray = new int[3]; // Criação do Array
        meuArray[0] = 5;
        meuArray[1] = 8;
        meuArray[2] = 2;

        meuArray = new int[]{5, 8, 2}; // Cria e preenche o array com valores

        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        // Alterando Elementos do Array
        meuArray[0] = 10;

        System.out.println();
        System.out.println("Valor alterado: " + meuArray[0]); // Saída: 10
        System.out.println();

        // Percorrendo Arrays
        for (int i = 0; i < meuArray.length; i++){

         System.out.println(meuArray[i]);
            
        }

        System.out.println();

        // Percorrendo Arrays com o for-each

        for (int i : meuArray) {
            System.out.println(i);
        }

    }
}
