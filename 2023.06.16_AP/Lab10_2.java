import java.time.LocalDate;

public class Lab10_2 {
    public static void main(String[] args){

        System.out.println("Dodanie jednego roku: ");
        LocalDate date1 = LocalDate.of(2000, 2, 29);
        date1 = date1.plusYears(1);
        System.out.println(date1);
        
        System.out.println("Dodanie czterech lat: ");
        LocalDate date2 = LocalDate.of(2000, 2, 29);
        date2 = date2.plusYears(4);
        System.out.println(date2);

        System.out.println("Dodanie cztery razy jeden rok: ");
        LocalDate date3 = LocalDate.of(2000, 2, 29);
        date3 = date3.plusYears(1).plusYears(1).plusYears(1).plusYears(1);
        /** 
        date3 = date3.plusYears(1);
        date3 = date3.plusYears(1);
        date3 = date3.plusYears(1);
        date3 = date3.plusYears(1);
        */
        System.out.println(date3);
    }
}
