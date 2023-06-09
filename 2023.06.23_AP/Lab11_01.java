import java.time.LocalTime;

public class Lab11_01 {
    public static void main(String[] args){
        TimeInterval meet1 = new TimeInterval(LocalTime.of(10,0), LocalTime.of(11,0));
        TimeInterval meet2 = new TimeInterval(LocalTime.of(9,30), LocalTime.of(10,15));
        TimeInterval meet3 = new TimeInterval(LocalTime.of(14,30), LocalTime.of(15,0));

        System.out.println("Czas trwania 1 spotkania: " + meet1.getDurationMinutes() + "min.");
        System.out.println("Czas trwania 2 spotkania: " + meet2.getDurationMinutes() + "min.");
        System.out.println("Czas trwania 3 spotkania: " + meet3.getDurationMinutes() + "min.");

        System.out.println("Spotkanie 1 pokrywa się z spotkaniem 2: " + meet1.overlaps(meet2));
        System.out.println("Spotkanie 1 pokrywa się z spotkaniem 3: " + meet1.overlaps(meet3));

    }   
}
