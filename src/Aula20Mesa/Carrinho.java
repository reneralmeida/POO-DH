package Aula20Mesa;

import java.util.ArrayList;

public class Carrinho {

    private Estado estado;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Carrinho() {
        this.estado = new Vazio(this);
    }

    public void addProduto(Produto p) {
        this.produtos.add(p);
    }

    public void cancelar() {
        if (produtos.size() > 0) {
            this.produtos.clear();
            this.estado = new Vazio(this);
            System.out.println("Cancelado");
        } else
            System.out.println("Carrinho já está vazio");
    }

    public void retornar(int opcao, Produto p) {
        if (opcao == 1)
            addProduto(p);
        else if (opcao == 2)
            cancelar();
        else if (opcao == 3)
            pagando();
        else if (opcao == 4)
            fechado();
        else
            System.out.println("Opção inválida.");

    }

    public void vazio() {

    }

    public void carregando() {

    }

    public void pagando() {

    }

    public void fechado() {

    }

}
