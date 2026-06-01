package Generics;

public class Mochila<T> {
    private T item;

    public void guardar(T item){
        this.item = item;
    }

    public T retirar(){
        return item;
    }

    public static void main(String[] args) {
        
        Mochila<String> mochilaNome = new Mochila<>();

        mochilaNome.guardar("Breno de Souza Tocchio");

        System.out.println(mochilaNome.retirar());

        Mochila<Integer> mochilaIdade = new Mochila<>();

        mochilaIdade.guardar(18);

        System.out.println(mochilaIdade.retirar() + " anos");

    }

}
