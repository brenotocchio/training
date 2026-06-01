package Collections;

import java.util.Set;
import java.util.HashSet;

public class SetExercise {
    public static void main(String[] args) {
        
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(20);
        conjunto.add(25);
        conjunto.add(48);
        conjunto.add(71);

        System.out.println("Conjunto completo: " + conjunto);

        boolean verificar = conjunto.add(20);
        boolean verificar2 = conjunto.add(33);

        System.out.println("O número 20 foi adicionado? " + verificar);
        System.out.println("O número 33 foi adicionado? " + verificar2);

        conjunto.remove(71);

        System.out.println("Conjunto após remoção: " + conjunto);

    }
}
