package Animal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Alpha","Rottweiler", 2006, 40, true, false);
        Cachorro cachorro1 = new Cachorro("Beta", "Doberman", 2015, 25, false, true);
        Cachorro cachorro2 = new Cachorro("Delta", "Bulldog", 2017, 15, true, true);

        System.out.println("Qual a raça?");
        System.out.println(cachorro.getRaca());
        Scanner ler = new Scanner(System.in);
        System.out.println("Em que ano estamos: ");
        int ano = ler.nextInt();
        System.out.println("Se estamos em " + ano + " então: ");
        int compare = cachorro.getAnoDeNascimento();
        int result = ano - compare;
        System.out.println(cachorro.getNome() + " possui " + result + " anos.");
        System.out.println("O mesmo possui chip?");
        System.out.println(cachorro.temChip());
        System.out.println("Primeiro cachorro está apto?");
        System.out.println(cachorro.podeAdotar());

        System.out.println("\nQual a raça?");
        System.out.println(cachorro1.getRaca());
        Scanner ler1 = new Scanner(System.in);
        System.out.println("Em que ano estamos: ");
        int ano1 = ler1.nextInt();
        System.out.println("Se estamos em " + ano + " então: ");
        int compare1 = cachorro1.getAnoDeNascimento();
        int result1 = ano1 - compare1;
        System.out.println(cachorro1.getNome() + " possui " + result1 + " anos.");
        System.out.println("O mesmo possui chip?");
        System.out.println(cachorro1.temChip());
        System.out.println("Segundo cachorro está apto?");
        System.out.println(cachorro1.podeAdotar());

        System.out.println("\nQual a raça?");
        System.out.println(cachorro2.getRaca());
        Scanner ler2 = new Scanner(System.in);
        System.out.println("Em que ano estamos: ");
        int ano2 = ler2.nextInt();
        System.out.println("Se estamos em " + ano + " então: ");
        int compare2 = cachorro2.getAnoDeNascimento();
        int result2 = ano2 - compare2;
        System.out.println(cachorro2.getNome() + " possui " + result2 + " anos.");
        System.out.println("O mesmo possui chip?");
        System.out.println(cachorro2.temChip());
        System.out.println("Terceiro cachorro está apto?");
        System.out.println(cachorro2.podeAdotar());

        }

    }


