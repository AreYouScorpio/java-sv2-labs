package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        int raise=100;

        Employee employee = new Employee( "Akos", 2021, 500);

        System.out.println("Az uj fizetes: " + employee.raiseSalary(raise));

    }

}
