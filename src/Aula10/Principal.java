package Aula10;

public class Principal {
    public static void main(String[] args) {
        Associado associado = new Associado("123", "Yana", 99, "Musculação");
        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("546", "Vi", "Musculação", 99, 25);
        System.out.println(associadoHabilitado.custoMensal());
    }
}
