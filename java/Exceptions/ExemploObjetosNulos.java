package Exceptions;

public class ExemploObjetosNulos {
    public static void main(String[] args) {
        
        String nome = "Breno"; // Variaveis locais devem ser inicializadas (obrigatório)

        int varLocal = 10;
        System.out.println("Variavel local: "+ varLocal);

        try {
            int tamanhoNome = nome.length(); // Tentando acessar objeto nulo

            System.out.println("Tamanho do nome: "+ tamanhoNome);

        } catch (NullPointerException e) {
            System.out.println("Erro: A variavel nome está nula!");

        }
    }
}
