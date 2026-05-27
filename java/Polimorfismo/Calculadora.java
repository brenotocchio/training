package Polimorfismo;

abstract class Operacao{
    abstract void calcular(double num1, double num2);
}

class Soma extends Operacao{
    @Override
    void calcular(double num1, double num2){
        System.out.println("Resultado soma: " + (num1 + num2));
    }
}

class Subtracao extends Operacao{
    @Override
    void calcular(double num1, double num2){
        System.out.println("Resultado subtração: " + (num1 - num2));
    }
}

class Multiplicacao extends Operacao{
    @Override
    void calcular(double num1, double num2){
            System.out.println("Resultado multiplicação: " + (num1 * num2));
        }
}

class Divisao extends Operacao{
    @Override
    void calcular(double num1, double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por zero.");
        }
        else
            System.out.println("Resultado divisão: " + (num1 / num2));
    }
}

public class Calculadora{
    public static void main(String[] args) {
        
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        soma.calcular(15, 5);
        subtracao.calcular(50, 20);
        multiplicacao.calcular(10, 6);
        divisao.calcular(161, 7);

    }
}
