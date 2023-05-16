import java.util.*;
import java.util.stream.*;

public class Lab07_1 {

    private String nazwa;
    private Optional<String> info;

    public Zad1(String nazwa, Optional<String> info) {
        this.nazwa = nazwa;
        this.info = info;
    }

    public Optional<String> getInfo() {
        return info;
    }

    public String getName() {
        return nazwa;
    }


    public static void main(String[] args) {

        // przykładowe obiekty
        Zad1 obj1 = new Zad1("A", Optional.of("info obj1"));
        Zad1 obj2 = new Zad1("B", Optional.empty());
        Zad1 obj3 = new Zad1("C", Optional.of("info obj3"));
        Zad1 obj4 = new Zad1("D", Optional.of("info obj4"));
        Zad1 obj5 = new Zad1("E", Optional.empty());
        Zad1 obj6 = new Zad1("F", Optional.of("info obj6"));
        Zad1 obj7 = new Zad1("G", Optional.of("info obj7"));
        Zad1 obj8 = new Zad1("H", Optional.of("info obj8"));
        Zad1 obj9 = new Zad1("I", Optional.empty());

        List<Zad1> list = Arrays.asList(obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);

        // grupowanie po pierwszej literze nazwy
        Map<Character, List<String>> map = list.stream().collect(Collectors.groupingBy(
                        o -> o.getName().charAt(0),Collectors.flatMapping(o -> o.getInfo().stream(), Collectors.toList())
        ));

        // wypisanie grup i ich wartości
        map.entrySet().forEach(x -> {
            System.out.println(x.getKey() + ": " + x.getValue());
        });
    }
}
