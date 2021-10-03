package Aula16;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rodrigo", "Brasil", "21128", 100);
        try {

            cliente.comprar(110);
        } catch (ClientesException e) {
            e.printStackTrace();
        }
    }
}
