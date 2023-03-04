import java.lang.Exception;

//Aleksandra Polacik, Wymierne, Lab06_3

public class Wymierna implements Comparable<Wymierna>{

    //konstruktor klasy Wymierna
    public Wymierna(int l, int m) {
        if (m == 0) {
            throw new IllegalArgumentException("Mianownik nie może być równy zero.");
        }
        int nwd = nwd(Math.abs(l), Math.abs(m));
        this.l = l / nwd;
        this.m = m / nwd;
    }


    public String toString() {
        if (m == 1) {
            return String.valueOf(l);
        } else {
            return l + "/" + m;
        }
    }


    public void skrocUlamek(int l, int m)
    {
        int d = nwd(l, m);

        l = l / d;
        m = m / d;

        System.out.println("Skrocony ulamek: " + l + "/" + m);
    }

    public static int nwd(int a, int b)
    {
        if (b == 0)
            return a;
        return nwd(b, a % b);

    }


    public void wypiszCalosci(int l, int m)
    {
        //jezli licznik > mianownik i jest reszta to wyciagnac calosci
        if (l > m && l % m != 0)
        {
            int calosci = l / m;
            int licznik = l % m; //reszta z dzielnia to nowy licznik
            System.out.println("Ulamek w postaci c l/m: " + calosci + " " + licznik + "/" + m);
        }

        //licznik rowny mianownikowi zawsze da 1
        else if (l == m)
        {
            int wynik = 1;
            System.out.println("Licznik rowny mianownikowi: " + wynik);

        }

        //jezeli reszta z dzielenia licznika przez mianownik = 0 to brak reszty
        else if (l % m == 0)
        {
            int cal = l/m;
            System.out.println("Calosci: " + cal + " brak reszty");
        }
    }

    public int compareTo(Wymierna other)
    {
        //porownanie wartosci licznikow i mianownikow

        int wynik1 = this.l * other.m;
        int wynik2 = other.l * this.m;

        //porownanie wynikow
        if(wynik1 < wynik2)
        {
            return -1;
        }
        else if(wynik1 > wynik2)
        {
            return 1;
        }
        else{
            return 0;
        }
    }

    private int l;
    private int m;

}