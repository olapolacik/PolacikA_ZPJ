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

    @Override
    public double getMeasure() {
        return salary;
    }

    private String name; //imie
    private double salary; //wynagrodzenie

}
