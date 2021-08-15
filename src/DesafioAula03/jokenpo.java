package DesafioAula03;

import java.util.Scanner;

public class jokenpo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Jogador 1: ");
        String Player1 = ler.nextLine();

        System.out.println("Jogador 2: ");
        String Player2 = ler.nextLine();

        System.out.println("Escolha " + Player1);
        int choice1 = ler.nextInt();

        System.out.println("Escolha " + Player2);
        int choice2 = ler.nextInt();

        System.out.println("""
                Lembrando:
                1 - Pedra
                2 - Papel
                3 - Tesoura
                """);

        if (Winner(choice1, choice2) == 0) {
            System.out.println("Deu empate!");
        } else if (Winner(choice1, choice2) == 1) {
            System.out.println(Player1 + " ganhou!");
        } else {
            System.out.println(Player2 + " ganhou!");
        }
    }

    public static int Winner(int choice1, int choice2) {
        int winner = 0;
        if ((choice1 == 1) && (choice2 == 2)) {
            winner = 2;
        } else if ((choice1 == 1) && (choice2 == 3)) {
            winner = 1;
        } else if ((choice1 == 2) && (choice2 == 1)) {
            winner = 2;
        } else if ((choice1 == 2) && (choice2 == 3)) {
            winner = 1;
        } else if ((choice1 == 3) && (choice2 == 1)) {
            winner = 1;
        } else if ((choice1 == 3) && (choice2 == 2)) {
            winner = 2;
        }
        return winner;
    }
}