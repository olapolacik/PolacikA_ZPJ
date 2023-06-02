import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Zad4 {
    public static void main(String[] args) {

        //sciezka do pliku
        String filePath = "src/zad4";

        try {
            //wyraz o najwiekszej liczbie liter
            String longestWord = Files.lines(Paths.get(filePath))
                    .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                    .orElse("");

            //wyraz o najkrotszej liczbie liter
            String shortestWord = Files.lines(Paths.get(filePath))
                    .min((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                    .orElse("");

            //srednia dlugosc ciagu znakow
            double averageLength = Files.lines(Paths.get(filePath))
                    .mapToDouble(String::length)
                    .average()
                    .orElse(0);

            System.out.println("Najdluzszy wyraz: " + longestWord);
            System.out.println("Najkrotszy wyraz: " + shortestWord);
            System.out.println("Srednia dlugosc wyrazow: " + averageLength);
            
          //przechwycenie wyjatku  
        } catch (IOException e) {
            System.out.println("Nie udalo sie odczytac pliku, sprobuj ponownie! " + e.getMessage());
        }
    }
}

