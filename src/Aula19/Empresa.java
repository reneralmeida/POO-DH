package Aula19;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String cnpj;
    private List<Empregado> listaEmpregados = new ArrayList<>();

    public Empresa(String cnpj) {

        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Empregado> getListaEmpregados() {
        return listaEmpregados;
    }

    public void setListaEmpregados(List<Empregado> listaEmpregados) {
        this.listaEmpregados = listaEmpregados;
    }

    public void addEmpregado(Empregado empregado){

        listaEmpregados.add(empregado);
    }

    public Double calcularSalarioTotal(){
        double salarioTotal = 0.0;
        for(Empregado empregado : listaEmpregados){
            salarioTotal += empregado.calcularSalario();
        }
        return salarioTotal;
    }
}
