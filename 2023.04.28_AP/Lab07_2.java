import java.util.Iterator;
import java.util.stream.Stream;


public class Lab07_2 {
    public static <T> Stream<T> zip(Stream<T> pierwszy, Stream<T> drugi) {
        Iterator<T> iter1 = pierwszy.iterator();
        Iterator<T> iter2 = drugi.iterator();
        Stream.Builder<T> builder = Stream.builder();
        while (iter1.hasNext() && iter2.hasNext()) {
            builder.accept(iter1.next());
            builder.accept(iter2.next());
        }
        return builder.build();
    }

    public static void main(String[] args){

        Stream<Integer> pierwszy = Stream.of(1,3,5,7);
        Stream<Integer> drugi = Stream.of(2,4,6);
        Stream<Integer> wynikowy = Lab07_2.zip(pierwszy,drugi);
        wynikowy.forEach(System.out::println);
    }
}
