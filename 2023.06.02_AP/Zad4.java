import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zad4 {
    public static void main(String[] args){

        String regex = "^a[b]*";
        String dane = "abbb";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dane);
        
        if(matcher.matches()){
            System.out.println("Dopasowano: " + dane);
        }else{
            System.out.println("Nic nie znaleziono");
        }

    }
}
