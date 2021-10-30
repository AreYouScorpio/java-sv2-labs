package composition.person;

public class Person {

    String name;
    String identificationCard;
    Address address;

    public Person(String name, String identificationCard) {
        correctData(name, identificationCard);
/*        this.name = name;
        this.identificationCard = identificationCard; */
    }


    public String personToString(){

        return name.toString()+identificationCard.toString();

    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public Address getAddress() {
        return address;
    }

    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void moveTo(Address address) {
        this.address = address;
    }




}
