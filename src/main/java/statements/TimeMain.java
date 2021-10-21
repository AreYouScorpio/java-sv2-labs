package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Time time = new Time (10 ,9 , 8);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Első időpont: (ora enter perc enter mp enter)" );

        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();


        System.out.println("Második időpont: (ora enter perc enter mp enter)" );

        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        Time time1 = new Time(hours1, minutes1, seconds1);
        Time time2 = new Time(hours2, minutes2, seconds2);


        System.out.println("1. ido: " + time1.toString());
        System.out.println("1. ido percekben: " +time1.getInMinutes());
        System.out.println("2. ido: " + time2.toString());
        System.out.println("2. ido masodpercekben: " + time2.getInSeconds());
        System.out.println("Az elso korabbi? " + time1.earlierThan(time2));

    }
}
