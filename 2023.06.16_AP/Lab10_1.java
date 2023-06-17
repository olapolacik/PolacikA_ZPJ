import java.time.LocalDate;
import java.util.Scanner;

public class Lab10_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rok: ");

        int rok = sc.nextInt();

        LocalDate date = LocalDate.ofYearDay(rok, 256);
        int dzienMiesiaca = date.getDayOfMonth();
        int miesiac = date.getMonthValue();

        System.out.println("Dzien programisty w roku -> " + rok + " to " + dzienMiesiaca + " " + nazwaMiesiaca(miesiac));
        sc.close();
    }

    private static String nazwaMiesiaca(int miesiac){
        switch(miesiac){
            case 1:
                return "stycznia";
            case 2:
                return "lutego";
            case 3:
                return "marca";
            case 4:
                return "kwietnia";
            case 5:
                return "maja";
            case 6:
                return "czerwca";
            case 7:
                return "lipca";
            case 8:
                return "sierpnia";
            case 9:
                return "września";
            case 10:
                return "października";
            case 11:
                return "listopada";
            case 12:
                return "grudnia";
            default:
                return "";
        
        }
    }
}
    