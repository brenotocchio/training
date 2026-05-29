package Generics;

class Peixe {
    private String nome;
    private int tamanho;

    Peixe (String nome, int tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome(){
        return nome;
    }

    public int getTamanho(){
        return tamanho;
    }
}

class Polvo {
    private String nome;
    private int tentaculos;

    Polvo (String nome, int tentaculos){
        this.nome = nome;
        this.tentaculos = tentaculos;
    }

    public String getNome(){
        return nome;
    }

    public int getTentaculos(){
        return tentaculos;
    }
}

public class Cesto<T> {

    private T conteudo;

    public T pegar(){
        return conteudo;
    }

    public void guardar(T conteudo){
        this.conteudo = conteudo;
    }

    public static void main(String[] args) {
        
        Cesto<Peixe> peixe = new Cesto<>();
        Cesto<Polvo> polvo = new Cesto<>();

        peixe.guardar(new Peixe("Peixe Boi", 15));
        polvo.guardar(new Polvo("Polvo Enzo", 8));
        
        Peixe peixeGuardado = peixe.pegar();
        Polvo polvoGuardado = polvo.pegar();

        System.out.println(peixeGuardado.getNome());
        System.out.println(peixeGuardado.getTamanho());

        System.out.println();

        System.out.println(polvoGuardado.getNome());
        System.out.println(polvoGuardado.getTentaculos());

    }

}