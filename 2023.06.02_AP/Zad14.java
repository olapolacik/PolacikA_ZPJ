import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad14 {
    public static void main(String[] args){

        String regex = "\\b\\w+\\B[z]\\w+";

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String tekst = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tekst);
        
        // Lista przechowująca wszystkie dopasowania
        List<String> dopasowania = new ArrayList<>();

        // Przeszukiwanie tekstu i dodawanie dopasowań do listy
        while (matcher.find()) {
            String dopasowanie = matcher.group();
            dopasowania.add(dopasowanie);
        }

        // Wyświetlanie dopasowań
        System.out.println("Dopasowania:");
        for (String dopasowanie : dopasowania) {
            System.out.println(dopasowanie);
        }
        
    }
}
