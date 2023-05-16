import java.io.FileNotFoundException;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Lab06_3 {
    public static void main(String[] args){
        try{
            //zamiana pliku w strumien tokenów
            Scanner sc = new Scanner(new File("alice.txt"));
            sc.useDelimiter("\\P{L}+");
            sc.tokens()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .limit(100)
                .forEach(System.out::println);

            //wczytywanie pliku ponownie i wyswietlenie 10 najczesciej wystepujacych slow
            sc = new Scanner(new File("alice.txt"));
            sc.useDelimiter("\\P{L}+");
            Map<String, Long> wordFrequencies = sc.tokens()
                .filter(s -> s.matches("a-zA-Z+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()
            ));

            wordFrequencies.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

        } catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
