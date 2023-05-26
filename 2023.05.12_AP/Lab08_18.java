import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab08_18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5);

        List<Integer> uniqueNumbers = numbers.parallelStream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Oryginalne liczby: " + numbers);
        System.out.println("Unikalne liczby: " + uniqueNumbers);
    }
}
