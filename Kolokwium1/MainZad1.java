public class MainZad1 {
    public static void main(String[] args) {
        int[] num = {19,11,20,99}; 
        Zad1 zad1 = new Zad1(num);
    
        System.out.println("Wypisanie elementow przy uzyciu hasNext i getNext:");
        while (zad1.hasNext()) {
            int element = zad1.getNext();
            System.out.println(element);
        }
    
        System.out.println("Wypisanie elementow przy uzyciu hasPrevious i getPrevious:");
        while (zad1.hasPrevious()) {
            int element = zad1.getPrevious();
            System.out.println(element);
        }
    }
    
}
