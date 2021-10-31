package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.println("Név: ");
        String name = scanner.nextLine();

        System.out.println("Szül. idő: [YYYY-MM-DD]");
        String born = scanner.nextLine();

        System.out.println("Irányítószám ");
        String postalCode = scanner.nextLine();

        System.out.println("Átlag osztályzat: ");
        String averageResult = scanner.nextLine();

        LocalDate bornLocalDate = LocalDate.parse(born);
        System.out.println(bornLocalDate);
        int postalCodeInteger = Integer.parseInt(postalCode);
        System.out.println(postalCodeInteger);
        double averageResultDouble = Double.parseDouble(averageResult);
        System.out.println(averageResultDouble);

        Person person = new Person(name, bornLocalDate, postalCodeInteger, averageResultDouble);
        exam.addPersonToExam(person);
        System.out.println(exam.getRegisteredPersons());







    }
}
