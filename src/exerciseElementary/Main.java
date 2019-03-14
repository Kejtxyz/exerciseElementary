package exerciseElementary;

import java.util.Scanner;

/**Przygotuj program, który pobierze od użytkownika długość podstawy trójkąta oraz jego
 wysokość, a następnie obliczy jego pole powierzchni*/
public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Podaj dlugosc podstawy trojkata");
        Scanner dlugosc = new Scanner(System.in);
        int c =  dlugosc.nextInt();

        System.out.println("Podaj wysokosc trojkat");
        Scanner wysokosc = new Scanner(System.in);
        int d = wysokosc.nextInt();

        int e = (c*d) /2;
        System.out.println(e);

    }
}
