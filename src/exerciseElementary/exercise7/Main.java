package exerciseElementary.exercise7;

import java.util.Scanner;

/**Przygotuj program, który pobierze od użytkownika długość boku kwadratu, a następnie
 obliczy obwód kwadratu, oraz jego pole powierzchni.*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadz dlugosc boku kwadratu ,liczbe calkowita");
        int c;
        int b ;
         Scanner bok = new Scanner(System.in);
        int a  = bok.nextInt();
        b = a * 4;
        System.out.println("Obwod kwadratu wynosi  " + b);
        c = a * a;
        System.out.println("Pole powierzchni kwadratu wynosi : " + c);


    }
}
