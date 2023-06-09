import java.time.LocalTime;
import java.time.Duration;

public class Lab11_05 {
    public static void main(String[] args){
        LocalTime czasWylotu = LocalTime.of(10,0);
        LocalTime czasPrzylotu = LocalTime.of(12,30);

        Duration czasTrwaniaLotu = Duration.between(czasWylotu, czasPrzylotu);

        long godziny = czasTrwaniaLotu.toHours();
        long minuty = czasTrwaniaLotu.toMinutes() % 60; 

        System.out.println("Czas trwania lotu -> " + godziny + " godz. " + minuty + " min.");
    }   
}
