package Abstratas;

abstract class Loja {

    int cnpj;
    String razaoSocial;
    Boolean aberta;

    abstract void abrir();

    abstract void fechar();

}

class LojaComercial extends Loja {

    @Override
    void abrir(){
        aberta = true;
    }

    @Override
    void fechar(){
        aberta = false;
    }

    LojaComercial (int cnpj, String razaoSocial, Boolean aberta){

        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = aberta;

    }

}

public class LojaInfos {

    public static void main(String[] args) {
        
        LojaComercial loja = new LojaComercial(123, "Breno", true);

        loja.abrir();

        if (loja.aberta) {
            System.out.println("A loja está aberta");
        }
        else
            System.out.println("a loja está fechada");

        //

        loja.fechar();

        //

        if (loja.aberta) {
            System.out.println("A loja está aberta");
        }
        else
            System.out.println("a loja está fechada");

    }
    
}