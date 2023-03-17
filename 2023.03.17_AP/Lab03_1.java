public class Lab03_1 {

    public static void main(String[] args){

        //utworzenie 2 obiektow klasy Greeter
        Greeter greeter1 = new Greeter(5, "Ola");
        Greeter greeter2 = new Greeter(5, "Kamila");


        //utowrzenie 2 watkow dla obiektu greeter1 i greeter2
        Thread thred1 = new Thread(greeter1);
        Thread thred2 = new Thread(greeter2);

        
        thred1.start();
        thred2.start();
    }    
}
