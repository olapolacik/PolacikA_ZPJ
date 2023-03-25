import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Ola Polacik
 */

public class Lab04_3 
{
    public static void main(String[] args)
    {
        String directoryPath = "C:/Users/Ola/Desktop/PolacikA_ZPJ";
        File directory = new File(directoryPath);

        //aby uzyskac tab. plikow z katalogu
        File[] files = directory.listFiles();

        //comparing - metoda statycza z interfejsu Comparator
        //thenComapring, getName - porownanie plikow wg nazw
        //isDirectory czy sa katalogami

        Arrays.sort(files, Comparator.comparing(File::isDirectory).reversed().thenComparing(File::getName));
        System.out.println(Arrays.toString(files));

    }
}
