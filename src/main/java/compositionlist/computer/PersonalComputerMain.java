package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {

        CPU cpu = new CPU("i7", 2.03);

        Hardware monitor = new Hardware("Samsung","17col");
        Hardware keyboard = new Hardware("Asus laptop", "old Barbie computer");

        Software windows = new Software("Windows", 3.1);
        Software linux = new Software("Linux", 1.0);




        PersonalComputer personalComputer = new PersonalComputer();

        personalComputer.setCpu(cpu);



        personalComputer.addHardware(monitor);
        personalComputer.addHardware(keyboard);
        personalComputer.addSoftware(windows);
        personalComputer.addSoftware(linux);

        System.out.println(personalComputer.getHardware());
        System.out.println(personalComputer.getSoftware());
        System.out.println(personalComputer.getCpu());

    }
}
