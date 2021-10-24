package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student firstStudent = new Student("Lacafaca Laca");
        Student secondStudent = new Student("Kis Kati");
        Student thirdStudent = new Student("Alma Virág");
        Student fourthStudent = new Student("Kutya Jani");
        Student fifthStudent = new Student("Cica Mica");
        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);
        students.add(fourthStudent);
        students.add(fifthStudent);

        System.out.println(students.size());

        firstStudent.setActive(false);
        fourthStudent.setActive(false);

        List<Student> studentsToRemove = new ArrayList<>();
        for (Student s : students) {
            if (!s.isActive()) {
                studentsToRemove.add(s);
            }
        }
        students.removeAll(studentsToRemove);

        System.out.println(students.size());
    }
}