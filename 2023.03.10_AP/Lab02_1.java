/**
 * @author Ola Połacik
 */

public class Lab02_1 {
    public static void main(String[] args)
    {
        //tablica obiektów z pracownikami
        Employee[] objects = {
                new Employee("Jan Kowalski", 2000),
                new Employee("Adam Nowak", 4000),
                new Employee("Ola Polacik", 5000)
	    };

        double averageSalary = objects[0].average(objects);
        //zaokraglenie do 2 miejsca po przecinku
        double avgSalary = Math.round(averageSalary * 100.0) / 100.0;
        System.out.println("Srednie wynagrodzenie pracownikow to: " + avgSalary);
    }
}