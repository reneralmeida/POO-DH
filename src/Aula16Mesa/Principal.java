package Aula16Mesa;

import Aula16.ClientesException;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Pacientes pacientes = new Pacientes("Juan", "Perez", "12345", new Date(2021/5/20));

        try {
            pacientes.darAlta(new Date(2021/4/15));
        } catch (PacientesException e) {
            e.printStackTrace();
        }

    }
}
