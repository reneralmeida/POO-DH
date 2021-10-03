package Checkpoint;

//Definindo a classe abstrata
public abstract class Conexao {

    //Atributos
    protected boolean tresG;
    protected boolean wiFi;

    //Construtor
    public Conexao() {
        this.tresG = false;
        this.wiFi = true;
    }

    //Método
    public abstract boolean conexao();

}