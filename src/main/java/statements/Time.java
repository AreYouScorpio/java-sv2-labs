package statements;

public class Time {


    private int hours;
    private int minutes;
    private int seconds;

    public Time (int hours, int minutes, int seconds)
    {
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }

    public int getInMinutes() {
        return minutes = hours * 60 + minutes;
    }

    public int getInSeconds() {
        return seconds = hours*60*60 + minutes*60 +seconds;
    }

    public boolean earlierThan(Time other) {
        int thisTimeInSeconds = this.getInSeconds();
        int otherTimeInSeconds = other.getInSeconds();
        return thisTimeInSeconds<otherTimeInSeconds;
    }

    public String toString() {
        return "Time: " +
                " " + hours +
                " : " + minutes +
                " : " + seconds +
                ' ';
    }
}
