package Aula22;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("bauru", 6.0);
        Produto produto2 = new Produto("french fries", 9.0);
        Combo combo = new Combo();

        combo.addProduto(produto);
        combo.addProduto(produto2);

        System.out.println(combo.calcularPreco());
    }
}
