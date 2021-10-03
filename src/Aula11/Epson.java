package Aula11;

import java.time.LocalDate;

public class Epson extends Impressora {

    public Epson(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
        return "O texto foi impresso!";
    }
}
