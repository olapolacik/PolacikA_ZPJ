import java.util.stream.Stream;

public class Zad2 {
    public static void main(String[] args) {
        //poczatek ciagu
        int firstTerm = 1; 
        //roznica miedzy kolejnymi wyrazami
        int commonDifference = 5;  

        Stream<Integer> arithmeticSequence = generateArithmeticSequence(firstTerm, commonDifference);

        System.out.println("Wypisanie 5 kolejnych wyrazow ciagu artymetycznego: ");
        arithmeticSequence.limit(5)
            .forEach(System.out::println);
    }

    public static Stream<Integer> generateArithmeticSequence(int firstTerm, int commonDifference) {
        return Stream.iterate(firstTerm, n -> n + commonDifference);
    }
}
