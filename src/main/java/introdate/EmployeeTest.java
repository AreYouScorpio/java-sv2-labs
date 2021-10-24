package introdate;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee (1977, 6, 27, "Akos");
        Scanner scanner = new Scanner((System.in));


        //employee.name=(scanner.nextLine();
        System.out.println(employee.getName());
        // employee.dateOfBirth = scanner.nextLine();
        System.out.println(employee.getDateOfBirth());
        // LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(employee.getBeginEmployment());

        employee.setName("Schweger Akos Tom");
        System.out.println(employee.getName());
    }
}
