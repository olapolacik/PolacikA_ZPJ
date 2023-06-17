import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Lab12_01 {
    public static void main(String[] args){

        //Ustawienia lokalne dla Francji
        Locale franceLocale = Locale.FRANCE;
        DateTimeFormatter franceFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm", franceLocale);

        //Ustawienia lokalne dla Chin
        Locale chinaLocale = Locale.CHINA;
        DateTimeFormatter chinaFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", chinaLocale);

        //Ustawienia lokalne dla Tajlandii (z cyframi tajskimi)
        Locale thailandLocale = new Locale("th", "TH");
        DateTimeFormatter thailandFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm", thailandLocale);

        //Pobranie bieżącej daty i czasu
        LocalDateTime now = LocalDateTime.now();

        //Formatowanie i wyświetlenie daty i czasu dla Francji
        String formattedFranceDateTime = now.format(franceFormatter);
        System.out.println("Francja: " + formattedFranceDateTime);

        //Formatowanie i wyświetlenie daty i czasu dla Chin
        String formattedChinaDateTime = now.format(chinaFormatter);
        System.out.println("Chiny: " + formattedChinaDateTime);

        //Formatowanie i wyświetlenie daty i czasu dla Tajlandi
        String formattedThailandDateTime = now.format(thailandFormatter);
        System.out.println("Tajlandia: " + formattedThailandDateTime);

    }
}
