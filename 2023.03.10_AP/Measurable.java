/**
 * @author Ola Połacik
 */

//interfejs Measurable
public interface Measurable
{
    double getMeasure();


   // metoda domyslna(default) kazda klasa implementujaca interefejs Measurable
    // bedzie miala dostep do metody average


    /**
     * Oblicza srednia wynagrodzen
     * @param objects tablica obiektow Measursable
     * @return srednia wartosc lub 0 jesli tablica jest pusta
     */
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

    /**
     *
     * @param objects tablica obiektow Measurable
     * @return nazwisko pracownika z najwyzszym wynagrodzeniem
     *         lub  "No objects" jesli tablica jest pusta, null.
     */
    default String getLargest(Measurable[] objects) {
        Measurable largest = largest(objects);
        if (largest == null) {
            return "No objects";
        }
        return "Nazwisko pracownika z najwyzszym wynagrodzeniem: " + largest.toString();
    }


    /**
     * @param objects tablica obiektów Measurable
     * @return obiekt Measurable z największą wartością miary
     *         lub null, jeśli tablica jest pusta lub null
     */
    static Measurable largest(Measurable[] objects){

        if(objects == null || objects.length == 0){
            return null;
        }

        Measurable largest = objects[0];
        for(int i = 1; i < objects.length; i++){
            if(objects[i].getMeasure() > largest.getMeasure()){
                largest = objects[i];
            }
        }
        return largest;
    }

}


