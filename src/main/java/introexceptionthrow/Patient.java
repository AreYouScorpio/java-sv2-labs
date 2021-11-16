package introexceptionthrow;

public class Patient {
    String name;
    String socialSecurityNumber;
    int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name.isEmpty()|| name==null) {throw new IllegalArgumentException("Nem lehet üres string!");}
        if (yearOfBirth<1900) {throw new IllegalArgumentException("Szül év legalább 1900 legyen !");}
        this.name = name;
            this.socialSecurityNumber = socialSecurityNumber;
            this.yearOfBirth = yearOfBirth;

    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {
        Patient patient = new Patient("", "0776419368", 1877 );

        System.out.println(patient);

    }
}
