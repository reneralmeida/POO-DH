package Aula19;

public class Principal {
    public static void main(String[] args) {
        Empresa dh = new Empresa("134131448");
        EmpregadoFactory factory = EmpregadoFactory.getInstance();

        dh.addEmpregado(factory.criarEmpregado("R"));
        dh.addEmpregado(factory.criarEmpregado("C"));

        dh.getListaEmpregados();
    }
}
