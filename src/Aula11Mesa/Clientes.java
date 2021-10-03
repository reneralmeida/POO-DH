package Aula11Mesa;

public class Clientes extends Contas{

    public Clientes(String banco, String cliente, int conta, double saldo) {
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
        return 0;
    }

}
