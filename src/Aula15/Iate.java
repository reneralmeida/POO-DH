package Aula15;

public class Iate extends Embarcacao {

    private int cabines;

    public Iate(int cabines) {
        this.cabines = cabines;
    }

    public void isLuxurious() {
        if (cabines > 4) {
            System.out.println("Este é luxuoso");
        } else {
            System.out.println("Não é luxuoso");
        }
    }
}
