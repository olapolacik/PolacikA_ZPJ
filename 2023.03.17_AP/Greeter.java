public class Greeter implements Runnable {
    
    public Greeter(int n, String target){
        this.n = n;
        this.target = target;
    }


    public String toString(){
        return n + " " + target + "target";
    }


    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Witaj, " + target + "!");
        }
    }




    
    private String target;
    private int n;

}
