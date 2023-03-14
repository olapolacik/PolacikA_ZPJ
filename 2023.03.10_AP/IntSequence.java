public class IntSequence {

    private IntSequence(int[] sequence)
    {
        this.sequence = sequence;
    }


    public static IntSequence of (int... value)
    {
        return new IntSequence(value);
    }


    public int[] getSequence() 
    {
        return sequence;
    }


    public String toString()
    {
        StringBuilder napis = new StringBuilder();
        napis.append("IntSequence -> [");
        for (int i = 0; i < sequence.length; i++)
        {
            napis.append(sequence[i]);
            if ( i < sequence.length - 1)
            {
                napis.append(", ");
            }
        }
        napis.append("]");
        return napis.toString();
    }


/** 
    //klasa anonimowa
    public static IntSequence of (int... value) {
        return new IntSequence (new int[] {value}) {
            public int suma() {
                int suma = 0;
                for (int i = 0; i < sekwencja.length; i++) {
                    suma += sekwencja[i];
                }
                return suma;
            }
        };
    }
*/
    //zadanie 5
    public static IntSequence constant(int num)
    {
        while(true)
        {
            System.out.println(num);
        }
    }

    private static int[] sequence;
    
}