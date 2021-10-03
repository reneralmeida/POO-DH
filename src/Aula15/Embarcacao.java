package Aula15;

import java.time.LocalDate;

public abstract class Embarcacao {

    private double precoBase;
    private double valorAdicional;
    private LocalDate anoDeFabricacao;
    private double comprimento;
    private Capitao capitao;

    public double calcularAluguel() {
        double valorAluguel;
        if (anoDeFabricacao > 2020) {
            valorAluguel = precoBase + valorAdicional;
            return precoBase;
        } else {
            valorAluguel = precoBase;
            return precoBase;
        }
    }
}
