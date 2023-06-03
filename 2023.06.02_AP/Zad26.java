import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad26 {
    public static void main(String[] args) {
        String path = "/home/student/mójplik.txt";

        // Wyodrębnienie nazw katalogów
        String directoryRegex = "(?<=/|^)[^/]+(?=/|$)";
        Pattern directoryPattern = Pattern.compile(directoryRegex);
        Matcher directoryMatcher = directoryPattern.matcher(path);

        while (directoryMatcher.find()) {
            String directory = directoryMatcher.group();
            System.out.println("Katalog: " + directory);
        }

        // Wyodrębnienie nazwy pliku i rozszerzenia pliku
        String filenameRegex = "([^/]+)(?:\\.([^/.]+))?$";
        Pattern filenamePattern = Pattern.compile(filenameRegex);
        Matcher filenameMatcher = filenamePattern.matcher(path);

        if (filenameMatcher.find()) {
            String filename = filenameMatcher.group(1);
            String extension = filenameMatcher.group(2);

            System.out.println("Nazwa pliku: " + filename);
            System.out.println("Rozszerzenie: " + extension);
        }
    }
}
