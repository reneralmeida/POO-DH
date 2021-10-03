package Aula20;

public class Feliz implements Estado{

    private Tamagochi t;

    public Feliz(Tamagochi t) {
        this.t = t;
    }


    @Override
    public void bebe() {
        System.out.println("Beep beep beep beep beep");
        t.setEstado(new Fome(t));
    }

    @Override
    public void come() {
        System.out.println("Tô feliz!");
        t.setEstado(new Sede(t));
    }

    @Override
    public void carinho() {
        System.out.println("Tudo certo.");
    }
}
