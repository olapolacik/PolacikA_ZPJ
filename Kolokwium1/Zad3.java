import java.util.Arrays;
import java.util.Comparator;

public class Zad3 {   
    public static void main(String[] args) {
        Integer[] num = {19,20,11,99};

        Arrays.sort(num, Comparator.comparingInt((Integer n) -> n % 10)
            .thenComparingInt(n -> (n / 10) % 10));

        System.out.println("Posortowana tablica: " + Arrays.toString(num));
    }
}
