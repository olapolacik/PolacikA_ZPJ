import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

public class WordCount {

    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("war_and_peace.txt")));
        String[] words = text.split("\\s+");

        long startTime = System.currentTimeMillis();

        AtomicInteger longWordsCount = new AtomicInteger();
        AtomicInteger shortWordsCount = new AtomicInteger();
        int threshold = 5;
        
        words.parallelStream()
                .forEach(s -> {
                    if (s.length() > threshold) {
                        longWordsCount.incrementAndGet();
                    } else {
                        shortWordsCount.incrementAndGet();
                    }
                });

        long parallelTime = System.currentTimeMillis() - startTime;
        System.out.println("Parallel Stream: Long words count: " + longWordsCount.get() + ", Short words count: " + shortWordsCount.get() + ", Time: " + parallelTime);

        // Stream
        startTime = System.currentTimeMillis();

        longWordsCount = new AtomicInteger();
        shortWordsCount = new AtomicInteger();

        words.stream()
                .forEach(s -> {
                    if (s.length() > threshold) {
                        longWordsCount.incrementAndGet();
                    } else {
                        shortWordsCount.incrementAndGet();
                    }
                });


        long sequentialTime = System.currentTimeMillis() - startTime;
        System.out.println("Dlugie slowa: " + longWordsCount.get() + ", Short words count: " + shortWordsCount.get() + ", Time: " + sequentialTime);

        System.out.println("Roznica czasu: " + (parallelTime - sequentialTime) + "ms");
    }
}

