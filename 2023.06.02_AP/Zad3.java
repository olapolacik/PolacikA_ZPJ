import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad3 {
    public static void main(String[] args){

        String regex = "^[a-zA-z0-9]+$";
        CharSequence dane = "DowO0lnyzn4k";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dane);

        if(matcher.matches()){
            System.out.println("Znaleziono: " + dane);
        }else{
            System.out.println("Nic nie znaleziono");
        }
    }
}
