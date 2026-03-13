package funcao_if;

import java.util.Scanner; // Import para entrada de dados do usuário;

public class IF_Exemplo_03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); //Utilizando import para criar variavel entrada do tipo Scanner(Entrada de teclado) para usuário digitar;

        System.out.println("Digite a nota do aluno: "); 

        double nota = entrada.nextDouble(); //Significa entrada de dados do "sout" acima.

        if (nota >= 7){
            System.out.println("Aluno aprovado!");
        }

        else if (nota >= 5){
            System.out.println("Aluno em recuperação.");
        }

        else{
            System.out.println("Aluno reprovado.");
        }

        entrada.close();

    }
}
