package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {




    Address address = new Address("Roermond", "6041HS", "Willem II Singel", 4);
        System.out.println(address);
    Details details = new Details("Nice flat in NL.", address, 100, 200);
        System.out.println(details);
    RealEstate realEstate = new RealEstate("NL flat", 200000, details);
        System.out.println(realEstate);



}
}
