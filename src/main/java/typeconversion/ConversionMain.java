package typeconversion;

import java.util.Arrays;

public class ConversionMain {

    public static void main(String[] args) {

        Conversion conversion = new Conversion();

        System.out.println(conversion.convertDoubleToDouble(111.66666));

        int[] numbers = {3, 7, 6, 1, 12, 35, 999, 4};
        byte[] result = conversion.convertIntArrayToByteArray(numbers);
        System.out.println(Arrays.toString(result));

        System.out.println(conversion.getFirstDecimal(666.111));
    }
}