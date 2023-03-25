/**
 * @author Ola Polacik
 */
public class Lab04_4
{
    public static void main(String[] args)
    {

        //tablica 3 instancji klasy Runnable 
        Runnable[] runnables = { 
            () -> System.out.println("Pierwszy"), 
            () -> System.out.println("Drugi"), 
            () -> System.out.println("Trzeci")
        };
        Runnable combinedRunnable = executeRunnables(runnables);
        combinedRunnable.run();

    }

    public static Runnable executeRunnables(Runnable[] runnables) 
    {
        return () -> {
            for (Runnable r : runnables) {
                //run wykonuje kolejno kod instancji obiektow zapisanych w tab.
                r.run();
            }
        };
    }
    

}