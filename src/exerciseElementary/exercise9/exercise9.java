package exerciseElementary.exercise9;

import java.util.Scanner;

/**Przygotuj program, który pobierze od użytkownika temperaturę w o C a następnie
 zamieni ją na temperaturę w o F*/
public class exercise9 {
    public static void main(String[] args) {
        System.out.println("Podaj temperature w stopniach cencjusza ");
        Scanner tempC = new Scanner(System.in);
        double c = tempC.nextDouble();
        c = c*9/5+32;
        System.out.println(c);
    }
}
