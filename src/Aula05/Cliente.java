package Aula05;

public class Cliente {

    private int numeroCliente;
    private String nome;
    private double divida;

    Cliente(int numero, String nome) {
        this.numeroCliente = numero;
        this.nome = nome;
        this.divida = 0;
    }

    public int getNumeroCliente() {
        return this.numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.divida = divida;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public String aumentarDivida(double valor) {
        this.divida = divida + valor;
        return "Sua dívida aumentou" + this.divida;
    }

    public String pagarDivida() {
        this.divida = 0;
        return "Você pagou sua dívida.";
    }

}
