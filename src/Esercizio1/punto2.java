package Esercizio1;

public class punto2 {
    public static boolean bisestileYear(int year) {
        if (year % 400 == 0) return true;
        else if (year % 100 == 0) return false;
        else if (year % 4 == 0) return true;
        else return false;
    }
}
