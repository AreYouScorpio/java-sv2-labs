package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {


    private List<String> colors = new ArrayList<>();


    private void addLast(String color) {
        colors.add(color);
    }

    ;

    private void addFirst(String color) {
        colors.add(0, color);
    }

    ;

    private void removeFirst() {
        colors.remove(0);
    }

    ;

    private void removeLast() {
        colors.remove(colors.size() - 1);
    }

    ;



    public List<String> getColors() {
        return colors;
    }

    public static void main(String[] args) {

        Capsules capsules = new Capsules();
        System.out.println(capsules.getColors());
        capsules.addLast("kek");
        System.out.println(capsules.getColors());
        capsules.addLast("zold");
        System.out.println(capsules.getColors());
        capsules.addFirst("piros");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());





    }




}
