import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lab08_16 {
    public static void main(String[] args) {
        // Strumień równoległy
        long parallelStartTime = System.nanoTime();
        List<BigInteger> parallelPrimes = Stream.generate(Lab08_16::generateRandomBigInteger)
                .parallel()
                .filter(number -> number.isProbablePrime(50)) // Używamy wartości pewności 50
                .limit(500)
                .collect(Collectors.toList());
        long parallelEndTime = System.nanoTime();
        long parallelDuration = TimeUnit.NANOSECONDS.toMillis(parallelEndTime - parallelStartTime);

        // Strumień sekwencyjny
        long sequentialStartTime = System.nanoTime();
        List<BigInteger> sequentialPrimes = Stream.generate(Lab08_16::generateRandomBigInteger)
                .filter(number -> number.isProbablePrime(50)) // Używamy wartości pewności 50
                .limit(500)
                .collect(Collectors.toList());
        long sequentialEndTime = System.nanoTime();
        long sequentialDuration = TimeUnit.NANOSECONDS.toMillis(sequentialEndTime - sequentialStartTime);

        // Wyświetlanie wyników
        System.out.println("Liczby pierwsze znalezione w strumieniu równoległym: " + parallelPrimes);
        System.out.println("Czas wykonania strumienia równoległego: " + parallelDuration + " ms");

        System.out.println("Liczby pierwsze znalezione w strumieniu sekwencyjnym: " + sequentialPrimes);
        System.out.println("Czas wykonania strumienia sekwencyjnego: " + sequentialDuration + " ms");

        // Porównanie wydajności
        if (parallelDuration < sequentialDuration) {
            System.out.println("Strumień równoległy jest szybszy.");
        } else if (parallelDuration > sequentialDuration) {
            System.out.println("Strumień sekwencyjny jest szybszy.");
        } else {
            System.out.println("Czasy wykonania są identyczne dla strumienia równoległego i sekwencyjnego.");
        }
    }

    private static BigInteger generateRandomBigInteger() {
        return new BigInteger(50, 100, Lab08_16.getRandom());
    }

    private static java.security.SecureRandom getRandom() {
        return new java.security.SecureRandom();
    }
}
