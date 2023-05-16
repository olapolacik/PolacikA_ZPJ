import java.util.Spliterator;
import java.util.stream.Stream;

public class Lab07_1 {
    public static <T> boolean isFinite(Stream<T> stream) {
        Spliterator<T>spliterator = stream.spliterator();
        long estimatedSize = spliterator.estimateSize();
        return estimatedSize != Long.MAX_VALUE;
    }

    public static void main(String[] args){
        //strumien liczb calk. od 1-5
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        boolean isStreamFinite = Lab07_1.isFinite(stream);
        System.out.println(isStreamFinite); 
    }
}

