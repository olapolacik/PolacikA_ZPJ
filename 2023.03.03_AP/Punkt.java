public class Punkt implements Comparable<Punkt>{

    //konstruktor klasy punkt
    public Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "Punkt (" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double obliczOdleglosc(Punkt drugiPunkt)
    {
        double odleglosc = Math.sqrt(Math.pow(this.x - drugiPunkt.x, 2) + Math.pow(this.y - drugiPunkt.y, 2));
        return odleglosc;
    }

    public double odlegloscOdPoczatku()
    {
        return Math.sqrt(x * x + y * y);
    }


    //porównuje punkty na podstawie ich odległości od początku układu współrzędnych
    public int compareTo(Punkt p)
    {
        double odleglosc1 = this.odlegloscOdPoczatku();
        double odleglosc2 = p.odlegloscOdPoczatku();

        if(odleglosc1 < odleglosc2)
        {
            return -1;
        }
        else if(odleglosc1 > odleglosc2)
        {
            return 1;
        }
        else{
            return 0;
        }
    }

    private double x;
    private double y;

}
