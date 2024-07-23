import java.util.Scanner;

import static Esercizio1.punto1.oddEven;
import static Esercizio1.punto2.bisestileYear;
import static Esercizio2.punto1.insertNumber;
import static Esercizio4.es4.countDown;

public class Main {
    public static void main(String[] args) {
        System.out.println(oddEven("Ciao"));
        System.out.println(bisestileYear(1992));
        System.out.println(insertNumber(2));
        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
        System.out.println("Inserisci un numero per far partire il countdown");
        int numStart = Integer.parseInt(scanner.nextLine());
        System.out.println(countDown(numStart));

    }
}