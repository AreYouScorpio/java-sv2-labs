package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students) {
        for (String s : students) {
            if (s.length() <= 10) {
                System.out.println(s + ": 1-es csop");
            } else {
                System.out.println(s + ": 2-es csop");
            }
        }
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Kis Bianka", "Nagy Bianka", "Lucifer Luca", "Cica Mica", "Kis Éva", "Almaalmaalma Béla");
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);
    }
}