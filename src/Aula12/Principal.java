package Aula12;

public class Principal {
    public static void main(String[] args) {
        Empresa dh = new Empresa("DH", "1544664");
        Funcionario funcionario1 = new Gerente("Mario", "Junior", "121351351", 10000);
        Funcionario funcionario2 = new Vendedor("José", "Abreu", "1315184153", 2000, 1000);

        dh.cadastrar(funcionario1);
        dh.cadastrar(funcionario2);

        dh.listar();

    }

}
