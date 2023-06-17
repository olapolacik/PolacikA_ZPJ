import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Lab12_04 {
    public static void main(String[] args) {
        // Pobieranie dostępnych lokalizacji
        Locale[] availableLocales = Locale.getAvailableLocales();

        // Lista unikalnych nazw lokalizacji we wszystkich dostępnych językach
        List<String> uniqueNames = getUniqueLocaleNames(availableLocales);

        // Wyświetlanie nazw lokalizacji
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }

    // Metoda zwracająca unikalne nazwy lokalizacji we wszystkich dostępnych językach
    private static List<String> getUniqueLocaleNames(Locale[] availableLocales) {
        Set<String> uniqueNames = new HashSet<>();

        // Dodawanie nazw lokalizacji do zbioru unikalnych nazw
        for (Locale locale : availableLocales) {
            String displayName = locale.getDisplayName(locale);
            if (!displayName.isEmpty()) {
                uniqueNames.add(displayName);
            }
        }

        return new ArrayList<>(uniqueNames);
    }
}
