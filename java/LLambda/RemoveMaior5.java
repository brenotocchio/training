package LLambda;

import java.util.*;

public class RemoveMaior5 {
    public static void main(String[] args) {
        
        List<String> minhalista = new ArrayList<>();

        minhalista.add("Banana");
        minhalista.add("Maçã");
        minhalista.add("Morango");
        minhalista.add("Uva");

        minhalista.removeIf(p -> p.length() > 5);

        System.out.println(minhalista);

    }
}