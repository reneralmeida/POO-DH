package Impressora;

import java.util.Date;

public class Impressora {

    private static Date dataFabricacao;
    private String modelo;
    private String tipoConexao;
    private int folhasDisponiveis;

    public Impressora(String modelo, String tipoConexao, Date dataFabricacao) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }

    private boolean temPapel() {
        if (folhasDisponiveis > 0)
            return true;
        else
            return false;
    }

    public void imprimir(String texto) {
        if (temPapel()) {
            System.out.println(texto);
        } else {
            System.out.println("Não tem papel");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public static Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }
}
