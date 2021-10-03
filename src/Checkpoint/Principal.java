package Checkpoint;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //Instanciando App
        App app = new App(5, 10, "Seja bem vindo ao MatchAdote (software em construção)", 1, "Ativo", 200, "Ativo");

        //Testando outros instanciamentos
        //App app2 = new App(8, 15, "Seja bem vindo", 2, "Inativo", 100, "Ativo");
        //App app3 = new App(10, 12, "Seja bem vindo", 2, "Ativo", 300, "Ativo");

        //Instanciando MatchMaking
        MatchMaking matchMaking = new MatchMaking("Max", 1, 2, "Bulldog", true);

        //Testando outros instanciamentos
        //MatchMaking matchMaking2 = new MatchMaking("Rex", 02, 3, "Pitbul", false);
        //MatchMaking matchMaking3 = new MatchMaking("Fred", 03, 1, "Labrador", true);
        //MatchMaking matchMaking4 = new MatchMaking("Jonnhy", 04, 4, "Vira-lata", true);
        //MatchMaking matchMaking5 = new MatchMaking("Bullet", 05, 5, "Pastor Belga", false);

        //Instanciando Adocao
        Adocao adocao = new Adocao("T-Rex", 1, 2, "Bulldog Francês", true);

        //Testando outros instanciamentos
        //Adocao adocao2 = new Adocao("Tico", 02, 3, "Vira-lata", true);
        //Adocao adocao4 = new Adocao("Tuco", 03, 1, "Maltês", false);
        //Adocao adocao5 = new Adocao("Walter", 04, 4, "Dog Alemão", true);

        //Instanciando Parceiros
        Parceiros parceiros = new Parceiros("Manoel", 1, true);

        //Testando outros instanciamentos
        //Parceiros parceiros2 = new Parceiros("Junior", 2, false);
        //Parceiros parceiros3 = new Parceiros("Mariana", 3, true);

        //Tetando alguns getters (descomentar nas respectivas classes para utilizá-los)
        //System.out.println(app.getUsuarios());
        //System.out.println(app.getBuild());
        //System.out.println(app.getDoacoes());

        //System.out.println(matchMaking.getPetIdade());
        //System.out.println(matchMaking.getPetRaca());
        //System.out.println(matchMaking.getPetNome());

        //System.out.println(adocao.getDoacoes());
        //System.out.println(adocao.getPetIdade());
        //System.out.println(adocao.getPets());

        //System.out.println(parceiros.getParceiros());
        //System.out.println(parceiros.getParcID());

        while (true) {

            System.out.println(app.menu);
            System.out.println("Verificando status de conexão (resultado em boolean): ");
            System.out.println(app.conexao());
            System.out.print(System.lineSeparator());
            //Testando o método de adoção.
            System.out.println(app.vaiAdotar());
            System.out.print(System.lineSeparator());
            //Testando o método de MatchMaking.
            System.out.printf(app.deuMatch());
            System.out.print(System.lineSeparator());
            System.out.print(System.lineSeparator());
            System.out.println("Testando método de MatchMaking com sobrecarga: ");
            System.out.println(matchMaking.deuMatch("Poodle", 3, false));
            System.out.print(System.lineSeparator());
            System.out.println("Testando método de Adoção com sobrecarga: ");
            System.out.println(adocao.vaiAdotar("Doggy", "Pincher", 2, true));
            System.out.print(System.lineSeparator());
            //Testando o método sobreescrito (advindo da interface) Resgatar.
            System.out.println(parceiros.resgatar());
            System.out.print(System.lineSeparator());
            //Testando o método cadastrar.
            System.out.println(app.cadastrar());
            System.out.print(System.lineSeparator());
            System.out.println("Testar novamente essa v1 debug? Digite true para reiniciar, false para sair.");
            Scanner input = new Scanner(System.in);
            boolean killApp = input.nextBoolean();
            if (!killApp) break;

        }
    }
}
