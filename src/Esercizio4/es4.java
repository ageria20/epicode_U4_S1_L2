package Esercizio4;

import java.util.Scanner;

public class es4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero per far partire il countdown");
        int numStart = Integer.parseInt(scanner.nextLine());
        for (int i = numStart; i >= 0; i--) {
            System.out.println(i);
        }
    }


}
