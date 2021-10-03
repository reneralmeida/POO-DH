package Aula16Mesa;

import java.util.Date;

public class Pacientes {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Pacientes(String nome, String sobrenome, String historiaClinica, Date dataInternacao)
    {   Date hoje= new Date();
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.before(hoje))
            this.dataInternacao=dataInternacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public void setDataInternacao(Date dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(Date dataAlta) throws PacientesException
    {
        if (dataAlta.after(dataInternacao))
            throw new PacientesException("Dados inválidos");
        else
            System.out.println("Ok");

    }



}
