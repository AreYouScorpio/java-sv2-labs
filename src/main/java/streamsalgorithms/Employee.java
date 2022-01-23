package streamsalgorithms;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    String name;
    int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Akos", 1977);
        Employee employee2 = new Employee("Bkos", 1980);
        Employee employee3 = new Employee("Ckos", 1979);
        Employee employee4 = new Employee("Dkos", 1978);


        List<Employee> employees =
                new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4));

        employees
                .stream()
                .sorted((o1, o2) -> o1.yearOfBirth-o2.yearOfBirth)
                .forEach(System.out::println);

        System.out.println("összeg1 = " +
        employees
                .stream()
                .mapToInt(employee -> employee.yearOfBirth)
                .reduce((x,y) -> x+y)
                .getAsInt()
                );

        int sum = employees
                .stream()
                .mapToInt(employee -> employee.yearOfBirth)
                .sum();
        System.out.println("összeg2 = " + sum);

        int sum2 = employees
                .stream()
                .mapToInt(employee -> LocalDate.now().getYear()-employee.yearOfBirth)
                .sum();
        System.out.println("összeg kor =" + sum2);

        System.out.println("1990 előtt született ennyi dolgozó: " +
        employees
                .stream()
                .mapToInt(employee -> employee.yearOfBirth)
                .filter(n -> n<1990)
                .count());

        System.out.println("legkorábban született születési éve: ");
               OptionalInt minAge =
                employees
                        .stream()
                        .mapToInt(employee -> employee.yearOfBirth)
                        .min();

        System.out.println(minAge.getAsInt());
                employees
                        .stream()
                        .filter(employee -> employee.yearOfBirth==minAge.getAsInt())
                        .map(employee -> employee.name).forEach(System.out::println);


        System.out.println("neve1 : " +
        employees
                .stream()
                .sorted((o1, o2) -> o1.yearOfBirth-o2.yearOfBirth)
                .findFirst()
                .map(employee -> employee.name));

        System.out.println("van 1990 előtt született? " +(
                employees
                .stream()
                        .mapToInt(employee -> employee.yearOfBirth)
                        .filter(n -> n<1990)
                        .count()>0));

        System.out.println(employees.stream().allMatch(employee -> employee.yearOfBirth<1981));

        System.out.print("van 1990 előtt született v2? ");

                OptionalInt minYoB =
                employees
                        .stream()
                        .mapToInt(employee -> employee.yearOfBirth)
                        .min();
        if (minYoB.getAsInt()<1990) System.out.println("van"); else System.out.println("nincs");


       System.out.println("1990 előtt születettek listája: " +(


                employees
                        .stream()
                        .filter(emp -> emp.yearOfBirth<1990)
                        .collect(Collectors.toList())));


        System.out.println("Employees névlista: " +(

                employees
                        .stream()
                        .map(employee -> employee.name)
                        .collect(Collectors.toList())));


        System.out.println("1990 előtt születettek névlistája: " +(


                employees
                        .stream()
                        .filter(emp -> emp.yearOfBirth<1990)
                        .map(employee -> employee.name)
                        .collect(Collectors.toList())));

    }



}
