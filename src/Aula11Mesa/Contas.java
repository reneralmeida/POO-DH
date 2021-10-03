package Aula11Mesa;

public abstract class Contas {

    private String banco;
    private String cliente;
    private int conta;
    protected double saldo;
    protected double valorJuro;

    public Contas(String banco, String cliente, int conta, double saldo) {
        this.banco = banco;
        this.cliente = cliente;
        this.conta = conta;
        this.saldo = saldo;
        this.valorJuro = valorJuro;
    }

    public abstract void deposito();
    public abstract void sacar();
    public abstract double mostrarSaldo();
    public abstract double cobrarJuro();
}
