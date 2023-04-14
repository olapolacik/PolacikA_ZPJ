import java.util.Scanner;

public class Lab06_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj ciąg znaków: ");
        String word = sc.nextLine();

        //usunięcie białych znaków z początku i końca
        word = word.trim();
        int numChar = word.length();
        int numWords = word.split("\\s+").length;
        double avgLength = (double) numChar / numWords;

        System.out.println("Średnia długość ciągu znaków wynosi: " + avgLength);
    }
}