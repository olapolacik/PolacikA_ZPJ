import java.util.Iterator;
import java.util.stream.Stream;

public class Lab07_3 {
    public static <T> Stream<T> zip(Stream<T> pierwszy, Stream<T> drugi) {
        Iterator<T> i1 = pierwszy.iterator();
        Iterator<T> i2 = drugi.iterator();
        Stream.Builder<T> stream_builder = Stream.builder();
        while (i1.hasNext() && i2.hasNext()) {
            stream_builder.add(i1.next()).add(i2.next());
        }
        return stream_builder.build();
    }

    public static void main(String[] args) {
        Stream<Integer> pierwszy = Stream.of(1, 2, 3);
        Stream<Integer> drugi = Stream.of(4, 5, 6, 7);
        Stream<Integer> wynik = zip(pierwszy, drugi);
        wynik.forEach(System.out::println);
    }
    
    // czwarty element z drugiego strumienia (7) nie jest uwzględniony w wyniku, 
    // ponieważ pierwszy strumień się skończył po trzecim elemencie.
    
}
