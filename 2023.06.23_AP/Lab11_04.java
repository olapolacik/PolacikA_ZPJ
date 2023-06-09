import java.time.LocalTime;
import java.time.Duration;

public class Lab11_04 {
    public static void main(String[] args){
        LocalTime czasWylotu = LocalTime.of(10,5);
        Duration czasTrwaniaLotu = Duration.ofHours(5).plusMinutes(30);

        LocalTime czasPrzylotu = czasWylotu.plus(czasTrwaniaLotu);

        System.out.println("Godzina przylotu: " + czasPrzylotu);
    }   
}
