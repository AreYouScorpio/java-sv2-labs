package introconstructors;

import java.time.LocalDateTime;

public class TaskMain {
    public static void main(String[] args) {

        LocalDateTime inputTime = LocalDateTime.of(1999, 1,1,10,10);
        Task task = new Task("Házi írás", "sok lecke :$", inputTime, 100);

        task.start();

        System.out.println(task.getTitle());
        System.out.println(task.getDescription());
        System.out.println(task.getDuration());
        System.out.println(task.getStartDateTime());

    }
}
