import java.math.BigInteger;

public class SquareSequence implements Sequence <BigInteger> 
{
    public boolean isNext()
    {
        return true;
    }

    public BigInteger next()
    {
        current = current.add(BigInteger.ONE);
        return current.multiply(current);
    }

    private BigInteger current = BigInteger.ZERO;

}
