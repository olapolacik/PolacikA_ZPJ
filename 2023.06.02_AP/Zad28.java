import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad28 {
    public static void main(String[] args) {
        String text = "Data dostawy: 19-06-1999, Data wysyłki: 16-07-2022";

        String regex = "(\\d{2})-(\\d{2})-(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll("$2/$1/$3");

        System.out.println("Wynik:");
        System.out.println(result);
    }
}
