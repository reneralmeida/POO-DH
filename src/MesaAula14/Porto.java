package MesaAula14;

public abstract class Porto {

    private int id;
    private String origem;
    protected boolean perigoso;

    public Porto(int id, String origem, boolean perigoso) {
        this.id = id;
        this.origem = origem;
        this.perigoso = perigoso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }
}
