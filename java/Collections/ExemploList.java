package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//import java.util.*; // Importa todas as classes do pacote java.util

public class ExemploList {
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        // Verificando se a lista contém um elemento
        System.out.println("Contém 'Java'?: " + lista.contains("Java")); // true

        // Adicionando todos os elementos em uma outra coleção
        List<String> outraLista = Arrays.asList("JavaScript", "Ruby");

        lista.addAll(outraLista);

        // imprimir --> [Java, Python, C++, Javascript, Ruby]
        System.out.println("Lista completa " + lista);

        // Removendo um elemento
        lista.remove("Python");

        // imprimir --> [Java, C++, Javascript, Ruby]
        System.out.println("Lista após remoção: " + lista);

        // Obtendo um elemento pelo índice
        String elemento = lista.get(2); // Optém o 3o elemento da lista

        System.out.println("Elemento no índice 2: " + elemento);

        // Limpando a lista
        lista.clear();

        System.out.println("Lista após limpar: " + lista); // []
    }
}
