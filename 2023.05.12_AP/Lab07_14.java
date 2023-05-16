import java.util.ArrayList;
import java.util.stream.Stream;

public class Lab07_14 {
    public static void main(String[] args){
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(3);
        lista2.add(4);
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3.add(5);
        lista3.add(6);

        Stream<ArrayList<Integer>> stream = Stream.of(lista1, lista2, lista3);

        //metoda 1
        ArrayList<Integer> wynik1 = stream.reduce(new ArrayList<>(), (acc, list) ->{
            acc.addAll(list);
            return acc;
        });
        System.out.println("Wynik 1: " + wynik1);

        //restart struminia
        stream = Stream.of(lista1, lista2, lista3);

        //metoda 2
        ArrayList<Integer> wynik2 = stream.reduce((acc,list) -> {
            acc.addAll(list);
            return acc;
        }).orElse(new ArrayList<>());
        System.out.println("Wynik 2: " + wynik2);

        
        //restart struminia
        stream = Stream.of(lista1, lista2, lista3);

        //metoda 3
        ArrayList<Integer> wynik3 = stream.reduce(new ArrayList<>(), (acc,list) -> {
            acc.addAll(list);
            return acc;
        }, (acc1, acc2) -> {
            acc1.addAll(acc2);
            return acc1;
        });
        System.out.println("Wynik 3: " + wynik3);
    }
}
