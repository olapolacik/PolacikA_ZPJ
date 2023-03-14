public class Lab02_4_5 {
    public static void main(String args[])
    {
        IntSequence sequence = IntSequence.of(4,6,10,34,99,100);
        System.out.println(sequence.toString());

        int[] values = sequence.getSequence();
        for (int value : values ){
            System.out.println(value + " ");
        }
        
        //zadanie 5
        System.out.println("Zadanie 5: " + IntSequence.constant(2));
    }
   
}
