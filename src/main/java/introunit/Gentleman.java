package introunit;

public class Gentleman {

    public String sayHello(String name){
        String nameNew;
        if (name == null) {
            nameNew = "Hello Anonymous!";
        } else {
            nameNew = "Hello " + name + "!";
        }
        return nameNew;
    }
}
