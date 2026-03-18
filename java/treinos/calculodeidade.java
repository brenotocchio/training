package treinos;

public class calculodeidade {
    
    public static void main(String[] args) {

        final int ANO_ATUAL = 2026; //Mostra ano atual
        int Ano_nascimento = 2007; //Ano de nascimento
        int anoFuturo = 2028; //Ano futuro
        boolean MaiordeIdade = (ANO_ATUAL - Ano_nascimento >= 18);

        System.out.println("Você tem " + (ANO_ATUAL - Ano_nascimento) + " anos"); //Calcula idade

        System.out.println("Em " + anoFuturo + " você terá " + (anoFuturo - Ano_nascimento)); //Calcula quantos anos terá no futuro

        System.out.println("Maior de idade: " + (MaiordeIdade));
    }
}
