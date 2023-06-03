import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad23 {
    public static void main(String[] args) {

        String tekst = "cat camera can pen cow cab cot";

        String regex = "\\b(c[a-z]{2})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tekst);

        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            String word = matcher.group(1);
            matcher.appendReplacement(result, word.toUpperCase());
        }
        matcher.appendTail(result);

        System.out.println("Wynik:");
        System.out.println(result.toString());
    }
}
