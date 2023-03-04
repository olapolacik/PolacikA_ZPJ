//Aleksanrda Polacik, Zespolone, Lab06_4

public class Zespolona implements Comparable<Zespolona>{

    public Zespolona(int rzeczywista, int urojona){
        this.rzeczywista = rzeczywista;
        this.urojona = urojona;
    }

    public String toString() {
        if (urojona >= 0) {
            return rzeczywista + "+" + urojona + "i";
        } else {
            return rzeczywista + "-" + Math.abs(urojona) + "i";
        }
    }

    //funkcja do wypisania pierwszej liczby zespolonej
    public void wypiszZespolona1(int rzeczywista, int urojona)
    {
        System.out.println(rzeczywista + "+" + urojona + "i");
    }


    //metoda do wypisania drugiej liczby zespolonej
    public void wypiszZespolona2(int rzeczywista2, int urojona2)
    {
        System.out.println(rzeczywista2 + "+" + urojona2 + "i");
    }


    //metoda sluzaca do dodania 2 liczb zespolonych
    public void dodaj(int rzeczywista, int urojona, int rzeczywista2, int urojona2)
    {
        int wynikRzeczywista = rzeczywista + rzeczywista2;
        int wynikUrojona = urojona + urojona2;
        System.out.println(wynikRzeczywista + "+" + wynikUrojona + "i");
    }


    //metoda sluzaca do odejmowania 2 liczb zespolonych
    public void odejmij(int rzeczywista, int rzeczywista2, int urojona, int urojona2)
    {
        int wynikRzeczywista = rzeczywista - rzeczywista2;
        int wynikUrojona = urojona - urojona2;

        System.out.println(wynikRzeczywista + "+" + wynikUrojona + "i");
    }


    //metoda sluzaca do mnozenie 2 liczb zespolonych
    public void mnozenie(int rzeczywista, int rzeczywista2, int urojona, int urojona2)
    {
        int prod1 = rzeczywista * rzeczywista2;
        int prod2 = urojona * urojona2;
        int prod3 = (rzeczywista + urojona) * (rzeczywista2 + urojona2);

        int wynikRzeczywista = prod1 - prod2;
        int wynikUrojona = prod3 - (prod1 + prod2);

        System.out.println(wynikRzeczywista + "+" + wynikUrojona + "i");
    }

    //Porownanie na podstawie modułu liczby zespolonej(odległości od początku układu współrzędnych)
    public int compareTo(Zespolona other)
    {
        double mod1 = Math.sqrt(Math.pow(this.rzeczywista, 2) + Math.pow(this.urojona, 2));
        double mod2 = Math.sqrt(Math.pow(other.rzeczywista, 2) + Math.pow(other.urojona, 2));
        if (mod1 < mod2) {
            return -1;
        } else if (mod1 > mod2) {
            return 1;
        } else {
            return 0;
        }
    }

    private int rzeczywista;
    private int urojona;

}
