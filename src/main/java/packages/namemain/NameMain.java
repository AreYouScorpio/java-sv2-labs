package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {

        Prefix pre = new Prefix(" Mr. ");
        FirstName first = new FirstName(" Akos ");
        LastName last = new LastName(" Schweger ");




        System.out.println(pre.getPrefix() + last.getLastName() + first.getFirstName());

    }

}
