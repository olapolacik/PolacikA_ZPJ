import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Lab05_1 
{
    public static void main(String[] args){

        List<String> words = Arrays.asList("ola", "kamila", "java", "informatyka", "lara", "komputer", "sala", "wiosna");

        AtomicInteger counter = new AtomicInteger(0);
        List<String> result = words.stream()
                .filter(s -> {
                    if (s.length() > 4 && counter.incrementAndGet() == 5) {
                        System.out.println("Wywołanie metody filter dla piątego długiego słowa");
                    }
                    return s.length() > 4;
                })
                .limit(10)
                .peek(s -> System.out.println("Wywołanie metody peek dla słowa " + s))
                .collect(Collectors.toList());
    }
}
