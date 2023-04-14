import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab06_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków: ");
        String input = sc.nextLine();

        List<String> maxSubString = new ArrayList<>();
        int maxLength = 0;

        for(int i = 0; i < input.length(); i++){
            for(int j = i + 1; j <= input.length(); j++){
                String subString = input.substring(i, j);
                int length = subString.length();

                if ( length > maxLength){
                    maxSubString.clear();
                    maxSubString.add(subString);
                    maxLength = length;
                }

                else if ( length == maxLength ){
                    maxSubString.add(subString);
                }
            }
        }
        System.out.printf("Najdłuższy ciąg znaków to %s%n", maxSubString);
    }

}