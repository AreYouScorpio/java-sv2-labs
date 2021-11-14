package introexceptionmoreexceptions;

import java.util.Locale;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("Akos",32);
        System.out.println(person);
        System.out.println(person.name);
        System.out.println(person.name.toUpperCase(Locale.ROOT));
    }

}
