import java.util.Iterator;

public class DigitSequence implements Iterator<Integer> 
{
    public DigitSequence(int x)
    {
        num = x;
    }

    public boolean hasNext()
    {
        return num > 0;
    }

    public Integer next()
    {
        int liczba = num % 10;
        num /= 10;
        return liczba;
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    private int num;

}