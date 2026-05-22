package Abstratas;

abstract class FiguraGeometrica {

    abstract int calcularArea();
    abstract int calcularPerimetro();

}

class Retangulo extends FiguraGeometrica{

    int base = 5, altura = 2;

    @Override
    int calcularArea() {
        return base * altura;
    }

    @Override
    int calcularPerimetro(){
        return 2*(base + altura);
    }

}

public class AreaPerimetro {

    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();

        System.out.println("A área do retangulo é: " + retangulo.calcularArea());

        System.out.println();

        System.out.println("O perimetro do retangulo é: " + retangulo.calcularPerimetro());


    }
    
}
