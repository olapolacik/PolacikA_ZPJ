import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lab08_17 {
    public static void main(String[] args) {
        String filename = "alice.txt"; 

        // Strumień równoległy
        long parallelStartTime = System.nanoTime();
        List<String> parallelLongestStrings = findLongestStringsParallel(filename);
        long parallelEndTime = System.nanoTime();
        long parallelDuration = TimeUnit.NANOSECONDS.toMillis(parallelEndTime - parallelStartTime);

        // Strumień sekwencyjny
        long sequentialStartTime = System.nanoTime();
        List<String> sequentialLongestStrings = findLongestStringsSequential(filename);
        long sequentialEndTime = System.nanoTime();
        long sequentialDuration = TimeUnit.NANOSECONDS.toMillis(sequentialEndTime - sequentialStartTime);

        // Wyświetlanie wyników
        System.out.println("Najdłuższe ciągi znaków znalezione w strumieniu równoległym: " + parallelLongestStrings);
        System.out.println("Czas wykonania strumienia równoległego: " + parallelDuration + " ms");

        System.out.println("Najdłuższe ciągi znaków znalezione w strumieniu sekwencyjnym: " + sequentialLongestStrings);
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

    private static List<String> findLongestStringsParallel(String filename) {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            return lines.parallel()
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .limit(500)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static List<String> findLongestStringsSequential(String filename) {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            return lines.flatMap(line -> Stream.of(line.split("\\s+")))
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .limit(500)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
