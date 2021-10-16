package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Band?");
        String band = scanner.nextLine();
        song.band = band ;

        System.out.println("Title?");
        String title = scanner.nextLine();
        song.title = title ;

        System.out.println("Length?");
        int length = scanner.nextInt();
        song.length = length ;

        System.out.println("Zene adatai:" + song.getBand() + song.getTitle() + song.getLength());

    }
}
