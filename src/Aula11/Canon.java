package Aula11;

import java.time.LocalDate;

public class Canon extends Impressora{
    public Canon(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
        return null;
    }

    @Override
    public boolean precisaTinta() {
        return super.precisaTinta();
    }
}
