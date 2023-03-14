import java.util.ArrayList;
import java.util.Comparator;

public class Lab02_8 
{
    public static void main(String[] args){

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Ania");
        strings.add("Bartek");
        strings.add("Michal");
        strings.add("Ola");
        strings.add("Dawid");

        Comparator<String> comp = new Comparator<String>()
        {
            @Override
            public int compare(String s1, String s2)
            {
                return s1.compareTo(s2);
            }
        };

        System.out.println("Przed: " + strings);     
        LuckySort.luckySort(strings, comp);
        System.out.println("Po: " + strings);
    }
}
