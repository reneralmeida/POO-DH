package Aula12;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> listfuncionario = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void cadastrar(Funcionario funcionario) {
        this.listfuncionario.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso");
    }

    public void listar() {
        for (int i = 0; i < listfuncionario.size(); i++) System.out.println(listfuncionario.get(i));
    }
}
