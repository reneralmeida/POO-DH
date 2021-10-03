package Checkpoint;

//Definindo herança
public class MatchMaking extends App{

    //Atributos
    public String petNome;
    public int petID;
    public int petIdade;
    public String petRaca;
    public boolean screened;

    //Construtor
    public MatchMaking(String petNome, int petID, int petIdade, String petRaca, boolean screened) {
        this.petNome = petNome;
        this.petID = petID;
        this.petIdade = petIdade;
        this.petRaca = petRaca;
        this.screened = screened;
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
//    public boolean isScreened() {
//        return screened;
//    }
//
//    public void setScreened(boolean screened) {
//        this.screened = screened;
//    }

    //Método com sobrecarga
    public String deuMatch(String petRaca, int petIdade, boolean screened) {
        return "Seu perfil bateu com um " + petRaca + " " + "de " + petIdade + " " + "anos. Já examinado? " + screened + ". Parabéns!";
    }

    //Método sobreescrito
    public boolean conexao() {
        if ((tresG) && (!wiFi))
            return false;
        return true;
    }

}