package pl.camp.micro.nowosci.w.java.java8.strumienie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Imie1", "Nazwisko1", 3000, Employee.Position.LOW));
        employees.add(new Employee(2, "Imie2", "Nazwisko2", 3200, Employee.Position.LOW));
        employees.add(new Employee(3, "Imie3", "Nazwisko3", 3400, Employee.Position.LOW));
        employees.add(new Employee(4, "Imie4", "Nazwisko4", 3600, Employee.Position.MID));
        employees.add(new Employee(5, "Imie5", "Nazwisko5", 3800, Employee.Position.LOW));
        employees.add(new Employee(6, "Imie6", "Nazwisko6", 4000, Employee.Position.LOW));
        employees.add(new Employee(7, "Imie7", "Nazwisko7", 4200, Employee.Position.MID));
        employees.add(new Employee(8, "Imie8", "Nazwisko8", 4400, Employee.Position.MID));
        employees.add(new Employee(9, "Imie9", "Nazwisko9", 4600, Employee.Position.HIGH));
        employees.add(new Employee(10, "Imie11", "Nazwisko11", 4800, Employee.Position.MID));
        employees.add(new Employee(11, "Imie12", "Nazwisko12", 5000, Employee.Position.MID));
        employees.add(new Employee(12, "Imie13", "Nazwisko13", 5200, Employee.Position.HIGH));
        employees.add(new Employee(13, "Imie14", "Nazwisko14", 5400, Employee.Position.HIGH));

        employees.stream()
                .filter(e -> e.getPosition() == Employee.Position.MID)
                .filter(e -> e.getSalary() > 4000)
                .filter(e -> e.getSalary() < 5000)
                .peek(e -> e.setSalary(4800))
                /*.map(e -> new Employee(e.getId(), e.getName(),
                        e.getSurname(), 4800, e.getPosition()))*/
                .map(Employee::getId)
                .forEach(System.out::println);

        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
