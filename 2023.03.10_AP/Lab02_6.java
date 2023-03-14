import java.math.BigInteger;

public class Lab02_6 
{
    public static void main(String[] args)
    {
        Sequence<BigInteger> sequence = new SquareSequence();
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i + "^2 = " + sequence.next());
        }
    }
}
