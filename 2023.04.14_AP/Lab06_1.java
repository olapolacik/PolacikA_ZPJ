import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lab06_1{
    public static void main(String[] args){
        String input = "Hello World!";
        Stream<String> codePointsStream = codePointsIntStream(input);
        codePointsStream.forEach(System.out::println);

    }

    //metoda ze slajdu 4
    public static Stream<String> codePoints(String s){
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < s.length()){
            int j = s.offsetByCodePoints(i, 1);
            result.add(s.substring(i, j)); 
            i = j;
        }
        return result.stream();
    }


    /** poprawiona metoda aby korzystała z IntStream.iterate
       IntStream.iterate tworzy skonczony strumien offsetow(poczatkowa wartosc 0), 
       nastepnie zwieksza sie o 1
       s.substring - wyodrębnienie podłańcucha 
    */

    public static Stream<String> codePointsIntStream(String s){
        return IntStream.iterate(0, i -> i < s.length(), i -> s.offsetByCodePoints(i,1))
        .mapToObj(i -> s.substring(i, s.offsetByCodePoints(i,1)));
    }
}
