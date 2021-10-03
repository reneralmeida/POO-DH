package Checkpoint;

import java.util.Scanner;

//Definindo herança e implementando interface
public class Adocao extends App implements Resgatar{

    //Atributos
    public String petNome;
    public int petID;
    public int petIdade;
    public String petRaca;
    public boolean castrado;

    //Construtor
    public Adocao(String petNome, int petID, int petIdade, String petRaca, boolean castrado) {
        super();
        this.petNome = petNome;
        this.petID = petID;
        this.petIdade = petIdade;
        this.petRaca = petRaca;
        this.castrado = castrado;
    }

    //Getters e setters (comentei pois acabei não usando)
//    public String getPetNome() {
//        return petNome;
//    }
//
//    public void setPetNome(String petNome) {
//        this.petNome = petNome;
//    }
//
//    public int getPetID() {
//        return petID;
//    }
//
//    public void setPetID(int petID) {
//        this.petID = petID;
//    }
//
//    public int getPetIdade() {
//        return petIdade;
//    }
//
//    public void setPetIdade(int petIdade) {
//        this.petIdade = petIdade;
//    }
//
//    public String getPetRaca() {
//        return petRaca;
//    }
//
//    public void setPetRaca(String petRaca) {
//        this.petRaca = petRaca;
//    }
//
//    public boolean isCastrado() {
//        return castrado;
//    }
//
//    public void setCastrado(boolean castrado) {
//        this.castrado = castrado;
//    }

    //Método com sobrecarga
    public String vaiAdotar(String petNome, String petRaca, int petIdade, boolean castrado) {
        return "Você escolheu adotar " + petNome + ", um" + " " + petRaca + " de " + petIdade + " " + "anos. Castrado? " + castrado;
    }

    //Métodos sobreescritos
    public boolean conexao() {
        if ((tresG) && (!wiFi))
            return false;
        return true;
    }

    @Override
    public String resgatar() {
        System.out.println("Gostaria de ver nossa lista de abandonados?");
        Scanner listaRe = new Scanner(System.in);
        String abandonados = listaRe.next();
        return "Campo em construção, tente novamente mais tarde.";
    }

}