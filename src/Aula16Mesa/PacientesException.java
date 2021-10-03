package Aula16Mesa;

public class PacientesException extends Throwable {

    public PacientesException() {}

    public PacientesException(String mensagem) {
        super(mensagem);
    }

    @Override
    public String toString() {
        return "A seguite exceção ocorreu: " + getClass().getName() + " Mensagem: " + getMessage();
    }
}
