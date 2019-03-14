package exerciseElementary.exercise10;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import exerciseElementary.exercise9.exercise9;

import java.util.Scanner;

/**
 * Dodaj do poprzedniego zadania możliwość wyboru czy chcesz wykonać konwersję
 * o C=> o F czy o F => o C
 */
public class exercise10 {
    public static void main(String[] args) {
        System.out.println("Jesli chcesz wykonac konwersje z c na f wprowadz 3, \n  jesli chcesz konwertowac z f na c wpisz 4.");
        Scanner konwertuj = new Scanner(System.in);
        int a1;
        double a2;
        String a3;
        String b3;

        a1 = konwertuj.nextInt();
        if (a1 == 3) {
            System.out.println("podaj stopnie C");
            konwertuj.nextInt();
            a1 =( a1 * 9) / 5 + 32;
            System.out.println(a1);
            return;
        } else
            System.out.println("Wprowadz Ilosc stopni F");
              konwertuj.nextInt();
              a1 = ((a1 - 32) * 5 / 9);
             System.out.println(a1);
             return;

    }

}
