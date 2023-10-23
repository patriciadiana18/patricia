package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siruri {

    public static void main(String[] args) {
        problema1();
        numerePrimeInSir();
        problema3();
        problema4();
    }

    private static void problema1() {
        String[] sir1 = {"ana", "mouse", "banane"};
        String[] sir2 = {"maria", "ioana", "ana"};

        List<String> duplicate = new ArrayList<>();

        for (String element1 : sir1) {
            for (String element2 : sir2) {
                if (element1.equals(element2)) {
                    duplicate.add(element1);
                    break;
                }
            }
        }
        System.out.println("Elementele duplicate sunt: " + duplicate);
    }

    public static void numerePrimeInSir() {
        int[] sir = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> numerePrime = new ArrayList<>();

        for (int numar : sir) {
            if (estePrim(numar)) {
                numerePrime.add(numar);
            }
        }

        System.out.println("Numerele prime din șir sunt: " + numerePrime);
    }

    public static boolean estePrim(int numar) {
        if (numar <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void problema3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți un număr (n) pentru șirul Fibonacci: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Introduceți un număr pozitiv valid.");
        } else {
            generareFibonacci(n);
        }

        input.close();
    }

    public static void generareFibonacci(int n) {
        long[] sirFibonacci = new long[n];
        sirFibonacci[0] = 0;
        if (n > 1) {
            sirFibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                sirFibonacci[i] = sirFibonacci[i - 1] + sirFibonacci[i - 2];
            }
        }

        System.out.println("Șirul Fibonacci până la " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(sirFibonacci[i] + " ");
        }
    }

    public static void problema4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți un număr pentru a verifica dacă este palindrom: ");
        int numar = input.nextInt();
        input.close();

        if (estePalindrom(numar)) {
            System.out.println("Numărul " + numar + " este palindrom.");
        } else {
            System.out.println("Numărul " + numar + " nu este palindrom.");
        }
    }

    public static boolean estePalindrom(int numar) {
        int invers = 0;
        int original = numar;

        while (numar > 0) {
            int cifra = numar % 10;
            invers = invers * 10 + cifra;
            numar /= 10;
        }

        return original == invers;
    }
}
