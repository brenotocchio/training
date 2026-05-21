package Interfaces01;

interface PedidoRestaurante{
    void adicionarItem(String item, double preco);
    double calcularTotal();
}

public class Pedido implements PedidoRestaurante{

    private double total = 0;

    @Override
    public void adicionarItem(String item, double preco){
        System.out.println("Adicionando " + item + " (R$" + preco + ") ao pedido.");
        total += preco;
    }

    public double calcularTotal(){
        return total;
    }

    public static void main(String[] args) {
        PedidoRestaurante pedido = new Pedido();
        pedido.adicionarItem("Hambúrguer", 15);
        pedido.adicionarItem("Batata frita", 8);
        pedido.adicionarItem("Refrigerante", 4);

        System.out.println();
        System.out.println("Valor total do pedido: R$" + pedido.calcularTotal());
    }

}