package Aula20;

public class Principal {
    public static void main(String[] args) {
        Tamagochi dh = new Tamagochi();

        dh.bebe();
        dh.carinho();
        System.out.println(dh.getEstado().getClass());
    }
}
