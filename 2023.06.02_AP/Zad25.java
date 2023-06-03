import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad25 {
    public static void main(String[] args) {

        System.out.println("a) Korzystając z metody find: ");
        String input = "Lorem ipsum 123 dolor -45 sit 678 amet";
        String regex = "-?\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<Integer> integers = new ArrayList<>();
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            integers.add(number);
        }

        System.out.println(integers);


        System.out.println("b) Korzystając z metody split: ");

        String input2 = "Lorem ipsum 123 dolor -45 sit 678 amet";
        String[] words = input.split("\\s+");

        List<Integer> integers2 = new ArrayList<>();
        for (String word : words) {
            if (word.matches("-?\\d+")) {
                int num = Integer.parseInt(word);
                integers2.add(num);
            }
        }

        System.out.println(integers2);
    }
}

