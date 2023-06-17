import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Lab10_6 {
    public static void main(String[] args){
        int rokPoczatkowy = 1900; //poczatek XX wieku
        int rokKoncowy = 1999; //koniec XX wieku

        System.out.println("Piątki 13-stego w XX wieku: ");
        
        //iterujemy przez wszystkie lata w XX wieku
        for(int year = rokPoczatkowy; year <= rokKoncowy; year++){
            //sprawdzenie kazdego miesiaca
            for(Month month : Month.values()){
                LocalDate date = LocalDate.of(year, month, 13);
            
            //sprawdzenie czy to piatek
            if(date.getDayOfWeek() == DayOfWeek.FRIDAY){
                System.out.println(date);
            }
        }
            
        }
    }   
}
