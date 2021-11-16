package introexceptionthrow.patient;

public class Patient {

    String name;
    String socialSecurityNumber;
    int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
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
        SsnValidator ssnValidator = new SsnValidator();
        Patient patient = new Patient("Akos", "476617346", 1977);

        if (ssnValidator.isValidSsn(patient.getSocialSecurityNumber())) System.out.println(patient); else
            System.out.println("Nemjó");;


    }
}
