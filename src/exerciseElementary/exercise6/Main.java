package exerciseElementary.exercise6;

import java.util.Scanner;

/**Przygotuj program, który sprawdzi czy wprowadzona przez użytkownika liczba jest
 parzysta. Wyświetl odpowiedni komunikat w zależności od tego czy liczba jest parzysta
 czy nieparzysta Skorzystaj z instrukcji warunkowej if oraz operatora modulo %*/
public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        System.out.println("Wprowadz liczbe ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = a %2;
     //   System.out.println(b);
        if (b < 1){
            System.out.println("Liczba : " + a + " jest parzysta");
        }
        else
            System.out.println("liczba : " + a + " jest nieparzysta");
    }
}
