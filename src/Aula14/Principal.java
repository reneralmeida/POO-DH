package Aula14;

public class Principal {
    public static void main(String[] args) {
        Jogador david = new Jogador("David", 1, false, false);
        Jogador rodrigo = new Jogador("Rodrigo", 2, false, true);
        Jogador nelson = new Jogador("Nelson", 0, false, true);
        Equipe turma3 = new Equipe("Turma 3");

        turma3.addJogador(david);
        turma3.addJogador(rodrigo);
        turma3.addJogador(nelson);
        turma3.mostrarJogadoresTitulares();
        System.out.println(turma3.getQuantidadeJogadoresLesionados());
    }
}
