public class lab01_1 {
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
}
