import java.util.Random;

public class RandomInts {
    private static Random generator = new Random();

    public static IntSequence randomInts(int low, int high) {
        class RandomSequence implements IntSequence {
            public int next() {
                return low + generator.nextInt(high - low + 1);
            }
            public boolean hasNext() { return true; }
        }
        return new RandomSequence();
    }

    private interface IntSequence {
        int next();
        boolean hasNext();
    }

    
    public static void main(String[] args){
        IntSequence seq = RandomInts.randomInts(1, 10);
        for (int i = 0; i < 10; i++) {
            System.out.println(seq.next());
        }
    }

}
