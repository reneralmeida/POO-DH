package Aula22Mesa;

import java.util.ArrayList;

public class Trem implements AreaMethods{
    ArrayList<AreaMethods> form;

    public Trem() {
        this.form = new ArrayList<>();
    }

    @Override
    public double calcularRetangulo() {
        return 0;
    }

    @Override
    public double calcularTriangulo() {
        return 0;
    }

    @Override
    public double calcularCirculo() {
        return 0;
    }
}
