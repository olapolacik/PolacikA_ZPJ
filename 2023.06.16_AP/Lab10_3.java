import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.util.function.Predicate;

public class Lab10_3 {
    public static void main(String[] args){
        LocalDate dzis = LocalDate.now();
        LocalDate kolejnyDzienRoboczy = dzis.with(nastepny(data -> data.getDayOfWeek().getValue() < 6));
        System.out.println("Nastepny dzien roboczy to: " + kolejnyDzienRoboczy);
    }
    
    public static TemporalAdjuster nastepny(Predicate<LocalDate> predykat){
        return temporal -> {
            LocalDate data = (LocalDate) temporal;
            do{
                data = data.plusDays(1);
            }while(!predykat.test(data));
            return data;
        };
    }
}
