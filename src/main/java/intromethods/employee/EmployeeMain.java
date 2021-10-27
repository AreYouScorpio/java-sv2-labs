package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        int raise=100;

        Employee employee = new Employee( "Akos", 2021, 500);


        System.out.println(employee);

        System.out.println("Név: " + employee.getName());
        System.out.println("Kezdés éve: " + employee.getHiringYear());
        System.out.println("Eddigi fizetés: " + employee.getSalary());


        System.out.println("Az uj fizetes: " + employee.raiseSalary(raise));

    }

}
