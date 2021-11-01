package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(2000));
        Operators operators = new Operators();
        int n = 101;
        System.out.println(operators.isEven(n));

System.out.println(operators.getResultOfDivision(16, 3));

        System.out.println(operators.isNull(null));
        System.out.println(operators.isNull(""));

        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty("abc"));
}
}
