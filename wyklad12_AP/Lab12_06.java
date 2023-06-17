import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class Lab12_06 {
    public static void main(String[] args) {
        // Lista walut o różnych symbolach w przynajmniej dwóch lokalizacjach
        List<Currency> currenciesWithDifferentSymbols = getCurrenciesWithDifferentSymbols();

        // Wyświetlanie wyników
        if (currenciesWithDifferentSymbols.isEmpty()) {
            System.out.println("Brak walut o różnych symbolach w przynajmniej dwóch lokalizacjach.");
        } else {
            System.out.println("Waluty o różnych symbolach w przynajmniej dwóch lokalizacjach:");
            for (Currency currency : currenciesWithDifferentSymbols) {
                System.out.println(currency.getCurrencyCode() + ": " + currency.getDisplayName());
            }
        }
    }

    // Metoda zwracająca listę walut o różnych symbolach w przynajmniej dwóch lokalizacjach
    private static List<Currency> getCurrenciesWithDifferentSymbols() {
        List<Currency> currenciesWithDifferentSymbols = new ArrayList<>();

        // Pobieranie wszystkich dostępnych lokalizacji
        Locale[] availableLocales = Locale.getAvailableLocales();

        // Sprawdzanie symboli walut dla dwóch wybranych lokalizacji
        Locale locale1 = new Locale("pl", "PL"); // Polska
        Locale locale2 = new Locale("de", "DE"); // Niemcy

        for (Currency currency : Currency.getAvailableCurrencies()) {
            String symbol1 = currency.getSymbol(locale1);
            String symbol2 = currency.getSymbol(locale2);

            if (!symbol1.equals(symbol2)) {
                currenciesWithDifferentSymbols.add(currency);
            }
        }

        return currenciesWithDifferentSymbols;
    }
}
