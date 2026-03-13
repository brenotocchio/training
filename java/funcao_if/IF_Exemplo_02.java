package funcao_if;

public class IF_Exemplo_02{
    public static void main(String[] args) {
        
        double nota = 8.0;

        if (nota >= 7){
            System.out.println("Aluno aprovado!");
        }

        else if (nota >= 5){
            System.out.println("Aluno em recuperação");
        }

        else{
            System.out.println("Aluno reprovado");
        }

    }  

}