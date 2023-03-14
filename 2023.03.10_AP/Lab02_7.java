public class Lab02_7 
{
    public static void main(String[] args)
    {
        DigitSequence sequenceDigit = new DigitSequence(9999);

        while(sequenceDigit.hasNext())
        {
            int num = sequenceDigit.next();
            System.out.print(num + " ");
        }
    }
}
