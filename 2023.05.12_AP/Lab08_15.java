import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lab08_15 {
    public static void main(String[] args){
        Stream<Double> stream = Stream.of(1.5,2.5,3.5,4.5,5.5);
      
        // Obliczanie średniej za pomocą collect i averagingDouble
        double average = stream.collect(Collectors.averagingDouble(Double::doubleValue));

        System.out.println("Srednia: " + average);
    }    
}
