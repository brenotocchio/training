package LLambda;

import java.util.*;

public class LambdaComCollection {
    public static void main(String[] args) {
        
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numerosPares = new ArrayList<>();

        int i = 10;

        listaDeNumeros.forEach(numero -> {

            System.out.println("Valor de i: " + i);
            
            if (numero % 2 == 0){
                numerosPares.add(numero);
            }

        });

        System.out.println("Números pares" + numerosPares);

    }
}
