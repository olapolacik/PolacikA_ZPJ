import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Lab12_07 {
    public static void main(String[] args) {
        // Lista lokalizacji, w których nazwy miesięcy są różne
        List<Locale> localesWithDifferentMonthNames = getLocalesWithDifferentMonthNames();

        // Wyświetlanie wyników
        if (localesWithDifferentMonthNames.isEmpty()) {
            System.out.println("Brak lokalizacji, w których nazwy miesięcy są różne (inne niż cyfry).");
        } else {
            System.out.println("Lokalizacje, w których nazwy miesięcy są różne (inne niż cyfry):");
            for (Locale locale : localesWithDifferentMonthNames) {
                System.out.println(locale.getDisplayName());
            }
        }
    }

    // Metoda zwracająca lokalizacje, w których nazwy miesięcy są różne (inne niż cyfry)
    private static List<Locale> getLocalesWithDifferentMonthNames() {
        List<Locale> localesWithDifferentMonthNames = new ArrayList<>();

        for (Locale locale : Locale.getAvailableLocales()) {
            String[] monthNames = new DateFormatSymbols(locale).getMonths();

            if (hasDifferentMonthNames(monthNames) && !areAllDigits(monthNames)) {
                localesWithDifferentMonthNames.add(locale);
            }
        }

        return localesWithDifferentMonthNames;
    }

    // Metoda sprawdzająca, czy wszystkie nazwy miesięcy są różne
    private static boolean hasDifferentMonthNames(String[] monthNames) {
        for (int i = 1; i < monthNames.length; i++) {
            if (!monthNames[i].equals(monthNames[0])) {
                return true;
            }
        }
        return false;
    }

    // Metoda sprawdzająca, czy wszystkie nazwy miesięcy składają się z cyfr
    private static boolean areAllDigits(String[] monthNames) {
        for (String monthName : monthNames) {
            if (!monthName.matches("\\d+")) {
                return false;
            }
        }
        return true;
    }
}
