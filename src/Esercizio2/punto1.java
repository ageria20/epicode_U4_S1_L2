package Esercizio2;

public class punto1 {

    public static String insertNumber(int num) {
        return switch (num) {
            case 0 -> "Zero";
            case 1 -> "Uno";
            case 2 -> "Due";
            case 3 -> "Tre";
            default -> "Il valore deve essere compreso tra 0 e 3";
        };
    }
}
