package Desafio;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Primo  {
    public static void main(String[] args) {
        int contador = 0;
        Scanner novo = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int num = novo.nextInt();
        for (int divisor = 1; divisor <= num; divisor++) {
            if (num % divisor == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
    }
}
