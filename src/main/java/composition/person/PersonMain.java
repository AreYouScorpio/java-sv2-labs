package composition.person;

public class PersonMain {

    public static void main(String[] args) {


        Person person = new Person("Akos", "5");
        Address address = new Address( "Hungary", "Nyul", "Iskola utca 3." , "9082");

        System.out.println(person.personToString());
        System.out.println(address.addressToString());

        address.correctData("Magyarország", "Nyúl", "Iskola utca 3.", "H-9082");
        System.out.println(address.addressToString());

        person.correctData("Ákos", "6");
        System.out.println(person.personToString());

        Address addressNew = new Address("NL", "Roermond", "Willem II Singel 4-B06", "6041HS");
        person.moveTo(addressNew);
        System.out.println(person.getAddress().addressToString());






    }

}
