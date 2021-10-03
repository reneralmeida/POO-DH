package Aula20;

public class Sede implements Estado{

    private Tamagochi t;

    public Sede(Tamagochi t) {
        this.t = t;
    }

    @Override
    public void bebe() {
        System.out.println("Vlw aí.");
    }

    @Override
    public void come() {
        System.out.println("Tô com sede.");
    }

    @Override
    public void carinho() {
        System.out.println("Tô com sede.");
    }
}
