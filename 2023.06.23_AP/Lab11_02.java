import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;


public class Lab11_02 {
    public static void main(String[] args){

        //pobranie stref czasowych
        Set<String> avaibleZoneIds = ZoneId.getAvailableZoneIds();

        //dzisiejsza data
        LocalDate today = LocalDate.now();

        //strumien stref czasowych
        avaibleZoneIds.stream()
            // przeksztalcenie stref czasowych na obiekty
            .map(zoneId -> ZonedDateTime.of(LocalDateTime.now(), ZoneId.of(zoneId)))
            // pobranie tylko tych ktorych data odpowiada dzisiejszej
            .filter(zonedDateTime -> zonedDateTime.toLocalDate().equals(today))
            // wynik
            .forEach(System.out::println);
    }
}
