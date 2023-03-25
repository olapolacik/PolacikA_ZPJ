import java.util.Arrays;
import java.util.Comparator;


public class Lab04_5 {
    public static void main(String[] args){
        Employee[] employees = {
            new Employee("Bogumiła Lis", 3500),
            new Employee("Anna Nowak", 5000),
            new Employee("Kornel Kalinowski", 2000),
            new Employee("Anna Kowalska", 3500),
            new Employee("Marcelina Rutkowska", 2500)
    };


    System.out.println("Pracownicy przed sortowaniem: ");
    for (Employee emp : employees) {
        System.out.println(emp);
    }

    Comparator<Employee> bySalaryThenName = Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName);

    Arrays.sort(employees, bySalaryThenName);
    System.out.println("Pracownicy posortowani według wynagrodzenia, a w przypadku takich samych według nazwiska: ");
    for (Employee emp : employees) {
        System.out.println(emp);
    }

    Comparator<Employee> bySalaryThenNameReverse = bySalaryThenName.reversed();
    Arrays.sort(employees, bySalaryThenNameReverse);
    System.out.println("odwrócona kolejność: ");
    for (Employee emp : employees) {
        System.out.println(emp);
    }

    }
}
