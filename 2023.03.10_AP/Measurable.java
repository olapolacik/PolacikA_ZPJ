/**
 * @author Ola Połacik
 */

//interfejs Measurable
public interface Measurable
{
    double getMeasure();

    //metoda domyslna(default) kazda klasa implementujaca interefejs Measurable
    // bedzie miala dostep do metody average
    default double average(Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum += obj.getMeasure();
        }
        if (objects.length > 0)
        {
            return sum / objects.length;
        }
        else
        {
            return 0;
        }
    }
}


