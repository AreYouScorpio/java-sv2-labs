package composition.person;

import com.sun.source.tree.BreakTree;

public class Address {
    String country;
    String city;
    String streetAndNumber;
    String zipCode;


    public Address(String country, String city, String streetAndNumber, String zipCode) {
        correctData(country, city , streetAndNumber, zipCode);
        /*this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;*/
    }

    public String addressToString() {
        return this.country.toString()+city.toString()+streetAndNumber.toString()+zipCode.toString();
    }

    public void correctData(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }



    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }
}
