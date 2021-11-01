package enumtype.position;

public enum Position {
    TAKARITO (100000, "felmosorongy"), TANAR (200000, "kreta"), IGAZGATO (300000, "borfotel");

    int salary;
    String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
