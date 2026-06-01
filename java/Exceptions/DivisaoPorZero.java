package Exceptions;

public class DivisaoPorZero {
    public static void main(String[] args) {
        int totalNotas = 0;
        int quantidadeDeAlunos = 10;

        try {
            int media = totalNotas / quantidadeDeAlunos; // Divisão por 0
            System.out.println("Média: " + media);

        } catch (ArithmeticException e) {
            System.out.println("Problema: Divisão por zero!");

        } finally {
            System.out.println("O programa terminou");
        }
    }
}
