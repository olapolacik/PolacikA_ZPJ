import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Lab12_03 {
    public static void main(String[] args) {
        // Lista lokalizacji z tą samą konwencją zapisywania daty jak Stany Zjednoczone
        List<Locale> localesWithUSDateConvention = getLocalesWithUSDateConvention();

        // Wyświetlanie wyników
        if (localesWithUSDateConvention.isEmpty()) {
            System.out.println("Brak lokalizacji korzystających z takiej samej konwencji zapisywania daty jak Stany Zjednoczone.");
        } else {
            System.out.println("Lokalizacje korzystające z takiej samej konwencji zapisywania daty jak Stany Zjednoczone:");
            for (Locale locale : localesWithUSDateConvention) {
                System.out.println(locale.getDisplayName());
            }
        }
    }

    // Metoda zwracająca lokalizacje z taką samą konwencją zapisywania daty jak Stany Zjednoczone
    private static List<Locale> getLocalesWithUSDateConvention() {
        List<Locale> localesWithUSDateConvention = new ArrayList<>();

        // Pobieranie dostępnych lokalizacji
        Locale[] availableLocales = Locale.getAvailableLocales();

        // Formatowanie daty w konwencji Stany Zjednoczone
        DateTimeFormatter usDateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // Sprawdzanie formatu daty dla każdej lokalizacji
        for (Locale locale : availableLocales) {
            LocalDate currentDate = LocalDate.now();
            String formattedDate = currentDate.format(usDateFormatter);

            try {
                LocalDate parsedDate = LocalDate.parse(formattedDate, usDateFormatter);
                if (parsedDate.getDayOfMonth() == currentDate.getDayOfMonth()
                        && parsedDate.getMonthValue() == currentDate.getMonthValue()
                        && parsedDate.getYear() == currentDate.getYear()) {
                    localesWithUSDateConvention.add(locale);
                }
            } catch (Exception e) {
                // Ignorowanie lokalizacji, które nie pasują do konwencji
            }
        }

        return localesWithUSDateConvention;
    }
}
