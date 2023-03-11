/**
 * @author Ola Połacik
 */

//publiczna klasa Employee
public class Employee implements Measurable {

    //konstruktor klasy Employee
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return name;
    }

    @Override
    public double getMeasure(){
        return salary;
    }

    public String getName(){
        return name;
    }

    private String name; //imie
    private double salary; //wynagrodzenie

}
