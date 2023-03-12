public class Lab01_1 {
    public static <T extends Comparable<T>> T min(T... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Values nie moze byc równy null lub zero");
        }
        T min = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(min) < 0) {
                min = values[i];
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> T max(T... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Values nie moze byc równy null lub zero");
        }
        T max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(max) > 0) {
                max = values[i];
            }
        }
        return max;
    }

    public static void main(String[] args){

        Wymierna w1 = new Wymierna(3,10);
        Wymierna w2 = new Wymierna(6,9);

        Wymierna[] wymierne = new Wymierna[] {w1, w2};

        Wymierna minW = min(wymierne);
        Wymierna maxW = max(wymierne);

        System.out.println("Min: " + minW);
        System.out.println("Max: " + maxW);


        Zespolona z1 = new Zespolona(2,4);
        Zespolona z2 = new Zespolona(6,9);

        Zespolona[] zespolone = new Zespolona[] {z1, z2};

        Zespolona minZ = min(zespolone);
        Zespolona maxZ = max(zespolone);

        System.out.println("Min: " + minZ);
        System.out.println("Max: " + maxZ);


        Punkt p1 = new Punkt(39, 101);
        Punkt p2 = new Punkt(1, -1);

        Punkt[] punkty = new Punkt[] {p1, p2};

        Punkt minP = min(punkty);
        Punkt maxP = max(punkty);

        System.out.println("Min: " + minP);
        System.out.println("Max: " + maxP);

    }
}
