import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad12 {
    public static void main(String[] args){

        String regex = "\\w+[.,!?]?";
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = input.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tekst);

        String lastWord = "";
        while (matcher.find()) {
            lastWord = matcher.group();
        }

        System.out.println("Ostatni wyraz z ew. interpunkcja: " + lastWord);
    
    }
}
