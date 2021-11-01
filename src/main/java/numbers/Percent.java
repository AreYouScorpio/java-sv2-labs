package numbers;

import java.util.Scanner;

public class Percent {

    public double getValue(int number, int anotherNumber) {
        double value = number / 100d * anotherNumber;
        return value;
    }

    public double getBase(int number, int anotherNumber) {
        double base = number / (double) anotherNumber * 100;
        return base;
    }

    public double getPercent(int number, int anotherNumber) {
        double percent = anotherNumber / (double) number * 100;
        return percent;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. szám:");
        int valueNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("2. szám:");
        int valueAnotherNumber = Integer.parseInt(scanner.nextLine());

        double valueResult = percent.getValue(valueNumber, valueAnotherNumber);

        System.out.println("Az eredmény: " + valueResult);

        System.out.println();

        System.out.println("1. szám:");
        int baseNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("2. szám:");
        int baseAnotherNumber = Integer.parseInt(scanner.nextLine());

        double baseResult = percent.getBase(baseNumber, baseAnotherNumber);

        System.out.println("Az eredmény: " + baseResult);

        System.out.println();

        System.out.println("1. szám:");
        int percentNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("2. szám:");
        int percentAnotherNumber = Integer.parseInt(scanner.nextLine());

        double percentResult = percent.getPercent(percentNumber, percentAnotherNumber);

        System.out.println("Az eredmény: " + percentResult + " %");
    }
}