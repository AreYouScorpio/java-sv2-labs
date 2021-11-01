package enumtype.solarsystem;


public enum SolarSystem {
    VENUSZ(1), PLUTO(2), FOLD(3), MARS(4)    ;
    private int moons;

    SolarSystem(int moons) {
        this.moons = moons;
    }

    public int getMoons() {
        return moons;
    }
}
