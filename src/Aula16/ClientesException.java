package Aula16;

public class ClientesException extends Exception {

    public ClientesException() {}

    public ClientesException(String mensagem) {
        super(mensagem);
    }

    @Override
    public String toString() {
        return "A seguite exceção ocorreu: " + getClass().getName() + " Mensagem: " + getMessage();
    }
}
