package intromethods.employee;

public class Employee {
    private String name;
    int hiringYear;
    int salary;

    public Employee(String name, int hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHiringYear(int hiringYear) {
        this.hiringYear = hiringYear;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int plusSalary) {
        return this.salary+plusSalary;
    }


}
