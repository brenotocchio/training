package poo;

//Código com class trabalhador ! ! !

public class folhaDePagamento {
    public static void main(String[] args) {

        trabalhador trabalhador = new trabalhador("Arnaldo",5000);
        
        trabalhador.aumentarSalario(100);
        
        System.out.println(trabalhador.obterinfo());

    }
}
