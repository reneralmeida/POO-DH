package Aula11Mesa;

public class ContaPoupanca extends Contas{


    public ContaPoupanca(String banco, String cliente, int conta, double saldo) {
        super(banco, cliente, conta, saldo);
    }

    @Override
    public void deposito() {

    }

    @Override
    public void sacar() {

    }

    @Override
    public double mostrarSaldo() {
        return saldo;
    }

    @Override
    public double cobrarJuro() {
        double valorJuro = 0;
        return saldo + valorJuro;
    }
}
