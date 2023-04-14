import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab06_4 {
    public static void main(String[] args) {
        String nazwaPliku = "words.txt";
        List<String> samogloski = Arrays.asList("a", "e", "i", "o", "u");

        // lista słów z samogłoskami
        List<String> slowa = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                List<String> unikalneSamogloski = Arrays.stream(line.split(""))
                        .filter(samogloski::contains)
                        .distinct()
                        .collect(Collectors.toList());

                if (unikalneSamogloski.size() == 5) {
                    slowa.add(line);
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println(slowa);
    }
}
