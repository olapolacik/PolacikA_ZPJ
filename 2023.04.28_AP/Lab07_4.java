import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * Jezeli strumien bedzie mial wewenetrzna implementace z wykorzytsaniem iteratora
 * to iterator moze nie wiedziec ile elementow pozostalo do przetworzenia
 * w strumieniu dlatego count() moze zwrocic niepoprawna wartosc
 */


public class Lab07_4 {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        OptionalDouble average = stream
                .mapToDouble(Double::doubleValue)
                .reduce((a, b) -> (a + b) / 2);
        System.out.println(average.getAsDouble());
    }
}

