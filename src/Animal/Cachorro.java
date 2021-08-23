package Animal;

public class Cachorro {
    public Cachorro(String nome, String raca, double peso, boolean chip, boolean estaFerido) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.chip = chip;
        this.estaFerido = estaFerido;
    }

    private String nome;
    private boolean apto;
    private String raca;
    private int anoDeNascimento;
    private double peso;
    private boolean chip;
    private boolean estaFerido;

    public Cachorro(String nome, String raca, int anoDeNascimento, double peso, boolean chip, boolean estaFerido) {
        this.nome = nome;
        this.raca = raca;
        this.anoDeNascimento = anoDeNascimento;
        this.peso = peso;
        this.chip = chip;
        this.estaFerido = estaFerido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaça(String raça) {
        this.raca = raca;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public String temChip() {
        if (chip)
            return "Sim.";
            return "Não.";
    }

    public String podeAdotar() {
        if ((getPeso() > 5) && isEstaFerido())
            return "Não.";
        return "Sim.";
    }
}

