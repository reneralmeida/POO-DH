package Checkpoint;

import java.util.Scanner;

//Definindo herança
public class App extends Conexao {

    //Atributos
    protected int usuarios;
    protected int pets;
    protected String menu;
    protected double build;
    protected String inserirCadastro;
    protected double doacoes;
    protected String parceiros;

    //Construtor
    public App(int usuarios, int pets, String menu, double build, String inserirCadastro, double doacoes, String parceiros) {
        this.usuarios = usuarios;
        this.pets = pets;
        this.menu = menu;
        this.build = build;
        this.inserirCadastro = inserirCadastro;
        this.doacoes = doacoes;
        this.parceiros = parceiros;
    }

    //Construtor
    public App() {
        super();
        this.usuarios = usuarios;
        this.pets = pets;
        this.menu = menu;
        this.build = build;
        this.inserirCadastro = inserirCadastro;
        this.doacoes = doacoes;
        this.parceiros = parceiros;
    }

    //Getters e setters (comentei todos pois acabei não usando)
//    public int getUsuarios() {
//        return usuarios;
//    }
//
//    public void setUsuarios(int usuarios) {
//        this.usuarios = usuarios;
//    }
//
//    public int getPets() {
//        return pets;
//    }
//
//    public void setPets(int pets) {
//        this.pets = pets;
//    }
//
//    public String getMenu() {
//        return menu;
//    }
//
//    public void setMenu(String menu) {
//        this.menu = menu;
//    }
//
//    public double getBuild() {
//        return build;
//    }
//
//    public void setBuild(double build) {
//        this.build = build;
//    }
//
//    public String getInserirCadastro() {
//        return inserirCadastro;
//    }
//
//    public void setInserirCadastro(String inserirCadastro) {
//        this.inserirCadastro = inserirCadastro;
//    }
//
//    public double getDoacoes() {
//        return doacoes;
//    }
//
//    public void setDoacoes(double doacoes) {
//        this.doacoes = doacoes;
//    }
//
//    public String getParceiros() {
//        return parceiros;
//    }
//
//    public void setParceiros(String parceiros) {
//        this.parceiros = parceiros;
//    }

    //Métodos
    public String deuMatch() {
        System.out.println("Gostaria de confirmar seu match? Sim ou não.");
        Scanner lerMatch = new Scanner(System.in);
        String matchInput = lerMatch.next();
        if (matchInput.equals("Sim") | (matchInput.equals("sim")))
            return "Parabéns e obrigado or utilizar o MatchAdote.";
        return "É questão de tempo até encontrar um match, não desista.";
    }

    public String vaiAdotar() {
        System.out.println("Gostaria de confirmar sua adoção? Sim ou não.");
        Scanner lerAdote = new Scanner(System.in);
        String adotarInput = lerAdote.next();
        if (adotarInput.equals("Sim") | (adotarInput.equals("sim")))
            return "Parabéns e obrigado por sua adoção";
        return "É questão de tempo até encontrar um pet para você, não desista.";
    }

    public String cadastrar() {
        System.out.println("Gostaria de se cadastrar conosco? Sim ou não.");
        Scanner lerCadastro = new Scanner(System.in);
        String cadastroInput = lerCadastro.next();
        System.out.println("Seria usuário ou parceiro?");
        Scanner lerChoice = new Scanner(System.in);
        String choiceInput = lerChoice.next();
        if ((cadastroInput.equals("Sim")) | (cadastroInput.equals("sim")) && (choiceInput.equals("Usuário")) | (choiceInput.equals("usuário"))) {
            return sejaUsuario();
        } else if ((cadastroInput.equals("não")) | (cadastroInput.equals("Não"))) {
            return """
                    A opção sempre estará disponível caso mude de ideia.
                    Obrigado por utilizar o MatchAdote!
                    """;
        } else if ((choiceInput.equals("parceiro")) | (choiceInput.equals("Parceiro"))) {
            return sejaParceiro();
        }
        throw new UnsupportedOperationException();
    }

    public String sejaUsuario() {
        System.out.println("Digite seu nome, telefone e email.");
        Scanner lerPartner = new Scanner(System.in);
        String bePartner = lerPartner.next();
        return "Obrigado por se cadastrar ao MatchAdote.";

    }

    public String sejaParceiro() {
        System.out.println("Digite seu nome, telefone e email.");
        Scanner lerPartner = new Scanner(System.in);
        String bePartner = lerPartner.next();
        return "Bem-vindo ao time MatchAdote";

    }

    //Sobreescrevendo método
    public boolean conexao() {
        if ((tresG) && (!wiFi))
            return false;
        return true;
    }

}