

package stringbasic;

import java.util.List;

public class UniversityMain {

    public static void main(String[] args) {
        Person person = new Person("Kis Peti", "kp@gmail.com", "12345",
                "6789", "112");
        Student student = new Student(person, "AA11", "1234");
        University university = new University();
        Person samePerson = new Person("Há Béla", "hb@gmail.com", "7654",
                "3456", "114");
        Student sameStudent = new Student(samePerson, "AA34", "876543");
        Person anotherPerson = new Person("El Said", "elsaid@gmail.com", "858585",
                "44444", "115");
        Student anotherStudent = new Student(anotherPerson, "AAA4", "34343");

        student.setCardNumber("VFVF4");
        System.out.println(student.getCardNumber());
        System.out.println(university.areEqual(student, sameStudent));
        System.out.println(university.areEqual(student, anotherStudent));

        List<Student> studentsWithNoStudents = university.getStudents();
        System.out.println(studentsWithNoStudents.size());
        university.addStudent(student);
        List<Student> studentsWithOneStudent = university.getStudents();
        System.out.println(studentsWithOneStudent.size());
    }
}