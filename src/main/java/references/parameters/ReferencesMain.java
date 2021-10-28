package references.parameters;

public class ReferencesMain {
    private Person a;
    private Person b;




    public static void main(String[] args) {

        Person a = new Person("Akos", 44);


        Person b = new Person("Cecil", 55);

        b = a;
        b.name = "Bkos";



        System.out.println(a.toString());
        System.out.println(b.toString());



        // Person c = new Person("Mugler", 8);

        int egesz1=24;
        int egesz2=egesz1++;

        System.out.println(egesz1);
        System.out.println(egesz2);

    }






}
