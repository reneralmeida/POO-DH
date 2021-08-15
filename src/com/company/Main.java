package com.company;
import java.util.Scanner;
public class Main {

    public static String dataNasc(String dia, String mes, String ano) {
        String data = dia + "/" + mes + "/" + ano;
        return data;
    }

    public static void main(String[] args) {
        //Ex01 Playground
        int num = 20;
        int num1 = 10;
        int div = num / num1;
        if (div % 2 == 0 ) {
            System.out.println("O valor é divisível");
        } else {
            System.out.println("O valor é indivisível");
        }
        //Ex02
        String name = "José";
        String name1 = "Ademir";
        if (name == name1) {
            System.out.println("O nome é igual");
        } else {
            System.out.println("O nome é diferente");
        }
        //Ex03
        int num2 = 35;
        int num3 = 55;
        if (num2 > num3) {
            System.out.println("Primeira variável maior que a segunda");
        } else if (num2 < num3) {
            System.out.println("Primeira variável menor que a segunda");
        } else {
            System.out.println("As variáveis são iguais");
        }
        //EX04
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite sua data de aniversário: ");
        String dia = entrada.nextLine();
        String mes = entrada.nextLine();
        String ano = entrada.nextLine();

        char inicialn = nome.charAt(0);
        char inicialS = sobrenome.charAt(0);
        System.out.println("Seu nome é: " + nome + " " + sobrenome);
        System.out.println("Suas iniciais " + inicialn + " " + inicialS);
        System.out.println(dataNasc(dia, mes, ano));
    }
}
