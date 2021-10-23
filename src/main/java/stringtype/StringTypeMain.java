package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {


        String prefix = "Hello ";
        String name = "John Doe";

        String message = prefix + name;
        System.out.println(message);

        message = message + 444;
        System.out.println(message);

        boolean b = message.equals("Hello John Doe");
        System.out.println(b);
        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);

        String empty = ""+"";
        System.out.println(empty);


        System.out.println(empty.length());
        System.out.println("Abcde".length());
        System.out.println("Abcde".charAt(0) + "&" + "Abcde".charAt(2));
        System.out.println("Abcde".substring(0,3));
    }
}

