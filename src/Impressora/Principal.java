package Impressora;

import java.util.Scanner;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date data = new Date();
        Impressora impressora = new Impressora( "Epson", "wifi", data);
        System.out.println(Impressora.getDataFabricacao());
    }
}
