import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * @author Ola Polacik
 */

//program zwracajacy wszytskie pliki z 
//podanym rozszerzeniem w wybranym katalogu

public class Lab04_2 
{    
    public static void main(String[] args) 
    {
        String directoryPath = "C:/Users/Ola/Desktop/PolacikA_ZPJ/2023.03.17_AP";
        String extension = "java";
        File directory = new File(directoryPath);
        File[] files = getFilesByExtension(directory, extension);
        System.out.println("Pliki z rozszerzeniam .java z katalogu 2023.03.17_AP: " + 
                            Arrays.toString(files) + "\n");
    }
    
    
    public static File[] getFilesByExtension(File directory, String extension) 
    {
        File[] files = directory.listFiles((dir, name) -> name.endsWith("." + extension));
        return files;
    }
    
}