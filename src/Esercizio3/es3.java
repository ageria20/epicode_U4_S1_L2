package Esercizio3;

import java.util.Arrays;
import java.util.Scanner;

public class es3 {

    public static void main(String[] args) {


        while (true) {
            System.out.println("Inserisci una stringa");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (str.equals(":q")) break;
            char[] arrChars = str.toCharArray();

            System.out.println(Arrays.toString(arrChars));
        }

    }


}
