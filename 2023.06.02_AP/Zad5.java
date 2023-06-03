import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Zad5 {
    public static void main(String[] args){

        String regex = "^a[b]+";

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String dane = sc.nextLine();
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dane);
        
        if(matcher.matches()){
            System.out.println("Dopasowano: " + dane);
        }else{
            System.out.println("Nic nie znaleziono");
        }
    }
}
