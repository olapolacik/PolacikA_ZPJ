import java.util.*;
import java.util.stream.Stream;

/** 
 Napisanie metody public static <T> boolean isFinite(Stream<T> stream) 
 nie jest dobrym pomysłem, ponieważ nie da się jednoznacznie określić, 
 czy strumień jest skończony czy nieskończony w czasie wykonania. 
 Ostatecznie to zależy od źródła strumienia i sposobu jego generowania.
*/

public class Lab07_2 {

    public static <T> boolean isFinite(Stream<T> stream) {
        Spliterator<T> spliterator = stream.spliterator();
        long szacowany_rozmiar = spliterator.estimateSize();
        return (szacowany_rozmiar != Long.MAX_VALUE);
    }
    
}

/**
    Ta metoda może nie działać poprawnie dla strumieni 
    generowanych dynamicznie lub o nieznanej liczbie elementów. 
    W takich przypadkach wartość zwracana może być błędna lub niejednoznaczna.
*/