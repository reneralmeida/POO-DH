package Checkpoint;

import java.util.Scanner;

//Definindo herança e implementando interface
public class Parceiros extends App implements Resgatar{

    //Atributos
    public String parcNome;
    protected int parcID;
    protected boolean vipAccess;

    //Construtor
    public Parceiros(String parcNome, int parcID, boolean vipAccess) {
        this.parcNome = parcNome;
        this.parcID = parcID;
        this.vipAccess = vipAccess;
    }

    //Getters e setters
//    public String getParcNome() {
//        return parcNome;
//    }
//
//    public void setParcNome(String parcNome) {
//        this.parcNome = parcNome;
//    }
//
//    public int getParcID() {
//        return parcID;
//    }
//
//    public void setParcID(int parcID) {
//        this.parcID = parcID;
//    }
//
//    public boolean isVipAccess() {
//        return vipAccess;
//    }
//
//    public void setVipAccess(boolean vipAccess) {
//        this.vipAccess = vipAccess;
//    }

    //Métodos sobreescritos
    public String sejaParceiro() {
        System.out.println("Digite seu nome, telefone e email.");
        Scanner lerPartner = new Scanner(System.in);
        String bePartner = lerPartner.next();
        return "Bem-vindo ao time MatchAdote";
    }

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
