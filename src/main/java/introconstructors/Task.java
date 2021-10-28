package introconstructors;

import java.time.LocalDateTime;

public class Task {
    String title;
    String description;
    LocalDateTime startDateTime;
    int duration;

    public Task(String title, String description, LocalDateTime startDateTime, int duration) {
        this.title = title;
        this.description = description;
        this.startDateTime = startDateTime;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }



    public String getDescription() {
        return description;
    }



    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }



    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDateTime start(){
        return startDateTime = LocalDateTime.now();
    }
}
