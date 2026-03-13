package funcao_if;
import java.util.Scanner;

public class IF_Exemplo_04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Você é brasileiro? (sim/não)");
        String nacionalidade = entrada.nextLine().toLowerCase();

        if (idade >= 16 && nacionalidade.equals("sim")){
            System.out.println("Você pode votar!");
        }
        else{
            System.out.println("Você não pode votar.");
        }

        entrada.close();

    }
}
