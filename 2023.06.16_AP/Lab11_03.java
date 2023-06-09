import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;

public class Lab11_03 {
    public static void main(String[] args){
        ZoneId.getAvailableZoneIds().stream()
        .filter(zoneId -> {
            ZoneRules zoneRules = ZoneId.of(zoneId).getRules();
            Instant now = Instant.now();
            ZonedDateTime currentDateTime = now.atZone(zoneRules.getOffset(now));
            return !zoneRules.isFixedOffset() && zoneRules.getDaylightSavings(currentDateTime.toInstant()) != null;
        })
        .forEach(System.out::println);
    }   
}
