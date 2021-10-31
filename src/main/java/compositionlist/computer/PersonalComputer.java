package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PersonalComputer {


    private List<Hardware> hardware = new ArrayList<>();
   private List<Software> software = new ArrayList<>();
   private CPU cpu;

    private String name;
    double clockSignal;




    public List<Hardware> getHardware() {
        return hardware;
    }

    public void setHardware(List<Hardware> hardware) {
        this.hardware = hardware;
    }

    public List<Software> getSoftware() {
        return software;
    }

    public void setSoftware(List<Software> software) {
        this.software = software;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getClockSignal() {
        return clockSignal;
    }

    public void setClockSignal(double clockSignal) {
        this.clockSignal = clockSignal;
    }


    public void addHardware(Hardware hardwareUnit){
        hardware.add(hardwareUnit);
    }

    public void addSoftware(Software softwareUnit){
        software.add(softwareUnit);
    }



    @Override
    public String toString() {
        return "PersonalComputer{" +
                "hardware=" + hardware +
                ", software=" + software +
                ", name='" + name + '\'' +
                ", clockSignal=" + clockSignal +
                ", cpu=" + cpu +
                '}';
    }
}


