package Aula20Mesa;

public class Vazio implements Estado{

    public Vazio(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
    @Override
    public void vazio() {
        System.out.println("Está vazio!");
    }

    @Override
    public void carregando() {

    }

    @Override
    public void pagando() {

    }

    @Override
    public void fechado() {

    }
}
