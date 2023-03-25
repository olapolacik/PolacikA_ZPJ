import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * @author Ola Połacik
 */

//program zwracajacy wszytskie podkatalogi wskazanego katalogu

public class Lab04_1
{
    public static void main(String[] args)
    {
        String directoryPath = "C:/Users/Ola/Desktop/PolacikA_ZPJ";
        File directory = new File(directoryPath);
        
        File[] subdirectoriesL = getSubdirectoriesL(directory);
        System.out.println("Za pomoca wyrazenia lambda: " + Arrays.toString(subdirectoriesL) + "\n");

        File[] subdirectoriesA = getSubdirectoriesA(directory);
        System.out.println("Z wykorzystaniem klasy anonimowej: " + Arrays.toString(subdirectoriesA) + "\n");
    }

    //metoda z wykorzytsaniem wyrazenia lambda
    public static File[] getSubdirectoriesL(File directory)
    {
        File[] subdirectories = directory.listFiles(file -> file.isDirectory());
        return subdirectories;
    }


    //metoda z wykorzystaniem klasy anonimowej
    public static File[] getSubdirectoriesA(File directory)
    {
        File[] subdirectories = directory.listFiles(new FileFilter() 
        {
            @Override
            public boolean accept(File file)
            {
                return file.isDirectory();
            }
        });
        return subdirectories;
    }
}