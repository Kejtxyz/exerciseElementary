package exerciseElementary.exercise8;

import java.util.Scanner;

/**Przygotuj program, który pobierze od użytkownika długość podstawy trójkąta oraz jego
 wysokość, a następnie obliczy jego pole powierzchni*/
public class Main {
    public static void main(String[] args) {
        int a;
        int h;
        int c;
        System.out.println("Podaj dlugosc podstawy trojkata");
        Scanner trojkatPodstawa = new Scanner(System.in);
        a = trojkatPodstawa.nextInt();
        System.out.println("podaj wysokosc torjkata");
        h = trojkatPodstawa.nextInt();
        c = (a*h)  /2;
        System.out.println( "Pole powierzchni trojkata wynosi : " + c);


    }
}
