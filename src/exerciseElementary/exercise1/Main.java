package exerciseElementary.exercise1;

import java.sql.SQLOutput;
import java.util.Scanner;

/**Przygotuj program, który pobierze od użytkownika 2 liczby oraz wyświetli wynik
 podstawowych działań matematycznych (dodawania, odejmowania, dzielenia,
 mnożenia)
 Wskazówka: Skorzystaj z rzutowania typów
 int liczba1 = 1;
 int liczba2 = 2;
 float wynik = liczba1 / (float)liczba2;
 float liczba3 = (float)liczba2;***/
public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Podaj liczbe calkowita 1");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Podaj liczbe calkowita 2");
        Scanner scanner1 = new Scanner(System.in);
        b = scanner1.nextInt();

        int c = a+b;
        int d = a-b;
        int e=a*b;
        int f=a/b;

        System.out.println("wynik dodawania suma : "+ c);
        System.out.println("wynik odejmowania roznica : " + d);
        System.out.println("wynik mnozenia iloczyn : " + e);
        System.out.println("wynik dzielenia iloraz : " + f);




    }
}
