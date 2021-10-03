package MesaAula14;

import Aula14.Comparavel;

import java.util.ArrayList;

public class Container extends Porto implements Comparando {

    private int id;
    private ArrayList<Container> listacontainers = new ArrayList<>();

    public Container(int id, String origem, boolean perigoso) {
        super(id, origem, perigoso);
    }

    public void addContainer(Container container) {
        this.listacontainers.add(container);
    }

    @Override
    public int comparando(Container container) {
        if (this.perigoso) {
            return 1;
        } else {
            return 0;
        }
    }
}
