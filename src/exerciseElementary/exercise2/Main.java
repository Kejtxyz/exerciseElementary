package exerciseElementary.exercise2;
/**Zadeklaruj i zainicjalizuj 5 elementową tablicę przechowującą łańcuchy znaków
 (String). Dodaj do każdego elementu tablicy jedno dowolne imię a następnie wyświetl
 kolejno wszystkie imiona z tablicy.**/
public class Main {
    public static void main(String[] args) {
        String[] array = new String[6];
        array[0] = "Monika";
        array[1] = "Aneta";
        array[2] = "Mikolaj";
        array[3] = "Nikodem";
        array[4] = "Roberto";
        array[5] = "Alex";

        for (int i=0; i<=5 ; i++){
            System.out.println(array[i]);
        }
    }
}
