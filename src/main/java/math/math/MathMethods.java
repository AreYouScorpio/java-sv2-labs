package math.math;

public class MathMethods {

    public static void main(String[] args) {

        System.out.println(Math.max(4, 1));

        System.out.println(Math.min(2, 1));

        System.out.println(Math.PI);

        System.out.println(Math.round(Math.PI));

        System.out.println(Math.round(1.111));
        System.out.println(Math.round(-1.111));

        System.out.println(Math.abs(-1.111));
        System.out.println(Math.abs(1.111));

        System.out.println(Math.negateExact(-1));
        System.out.println(Math.negateExact(2));

        System.out.println(Math.addExact(3, 2));

        System.out.println(Math.subtractExact(10, 1));

        System.out.println(Math.multiplyExact(5, 4));

        System.out.println(Math.pow(3.0, 2.0));

        System.out.println(Math.incrementExact(6));

        System.out.println(Math.decrementExact(6));

        System.out.println(Math.random());
    }
}