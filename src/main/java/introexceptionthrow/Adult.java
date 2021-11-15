package introexceptionthrow;

public class Adult {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Adult(String name, int age) {
        if (age<18)  {throw new IllegalArgumentException("kicsi vagy");}
        this.name = name;
        this.age = age;
    }
}
