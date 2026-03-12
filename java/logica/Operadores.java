package logica;
public class Operadores {
    
    //Rodar comando principal 
    public static void main(String[] args) {
        
        mostrarOperadoresAritmeticos();

        System.out.println("-----------------------");

        mostrarOperadoresRelacionais();

        System.out.println("-----------------------");

        mostrarOperadoresLogicos();

    }

    //Método que demonstra operadores aritmeticos no comando principal
    public static void mostrarOperadoresAritmeticos(){
        
        int a = 10;

        int b = 3;

        System.out.println("Soma: " + (a + b));

        System.out.println("Subtração: " + (a - b));

        System.out.println("Multiplicação: " + (a * b));

        System.out.println("Divisão: " + (a / b));

        System.out.println("Resto da divisão: " + (a % b));




    }

    //Método que demonstra operadores Relacionais no comando principal
    public static void mostrarOperadoresRelacionais(){
        int x = 10;

        int y = 20;

        System.out.println("x é igual a y? " + (x == y));

        System.out.println("x é diferente a y? " + (x != y));

        System.out.println("x é maior que y? " + (x > y));
        
        System.out.println("x é maior ou igual a 10? " + (x >= 10));

        System.out.println("x é menor ou igual a 15? " + (x <= 15));

    }
    //Método que demonstra operadores lógicos no comando principal
    public static void mostrarOperadoresLogicos(){
        //Declara idade = 18
        int idade = 18;

        //Declara se tem carteira ou não
        boolean temCarteira = true;

        //Declara se pode dirigir / Idade maior ou igual a 18 e Se tiver carteira
        boolean podeDirigir = (idade >= 18) && temCarteira;

        //Declara se pode viajar sozinho / Idade maior ou igual 18 ou tem carteira
        boolean podeViajarSozinho = (idade >= 18) || temCarteira;

        boolean naoTemCarteira = !temCarteira;

        System.out.println("Pode dirigir? " + podeDirigir);

        System.out.println("Pode viajar sozinho? " + podeViajarSozinho);

        System.out.println("Não tem carteira? " + naoTemCarteira);


    }

}
