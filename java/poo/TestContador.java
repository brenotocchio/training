package poo;

class Contador {
    
    static int contagem = 0;

    public Contador(){
        contagem++;
    }

}

public class TestContador {

    public static void main(String[] args) {
        Contador c1 = new Contador();

        Contador c2 = new Contador();

        Contador c3 = new Contador();

        System.out.println("Número de objetos criados: " + Contador.contagem);


        //Apenas para tirar marcação //IGNORE
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

}
