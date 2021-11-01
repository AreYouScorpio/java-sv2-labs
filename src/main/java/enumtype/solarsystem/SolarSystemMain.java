package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        //for (int i=0; i<4; i++)
        //System.out.println(SolarSystem.Planets.values()[i].toString());

        System.out.println(SolarSystem.FOLD);
        System.out.println(SolarSystem.FOLD.getMoons());
    }
}
