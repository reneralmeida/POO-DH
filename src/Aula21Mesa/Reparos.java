package Aula21Mesa;

public class Reparos {

    protected String nomeItem;
    protected double custo;
    protected String enderecoEntrega;

    public Reparos(String nomeItem, double custo, String enderecoEntrega) {
        this.nomeItem = nomeItem;
        this.custo = custo;
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public void mudarEndereco() {

    }

    public void darOrcamento() {

    }

    public void adicionarExtras() {

    }

    public void nextState() {

    }
}
