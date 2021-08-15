package ExFuncao;

import java.util.Scanner;

public class booleanFunction {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        int num = ler.nextInt();

        System.out.println("Segundo valor ");
        int divisor = ler.nextInt();

        if (eDivisivel(num, divisor) == false) {
            System.out.println("False, não é divisível");
        } else {
            System.out.println("True, é divisível");
            }
        }

    public static boolean eDivisivel (int num, int divisor) {
        if (num % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }
}
