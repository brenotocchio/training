package do_while;

public class do_while_exercicio2 {
    public static void main(String[] args) {
        
        int contador = 0;

        do {

            System.out.println("Contando: " + contador);
            contador += 2;

        } while (contador <= 50);

        System.out.println("Finalizado.");

    }
}
