package LLambda;

import java.util.*;

public class RemovePares {
    public static void main(String[] args) {
        
        Set<Integer> numeros = new HashSet<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(9);
        numeros.add(10);

        numeros.removeIf(n -> n % 2 == 0);

        System.out.println(numeros);

    }
}
