package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class CPU {
    String name;
    double clockSignal;


    public CPU(String name, double clockSignal) {
        this.name = name;
        this.clockSignal = clockSignal;
    }


    @Override
    public String toString() {
        return "CPU{" +
                "name='" + name + '\'' +
                ", clockSignal=" + clockSignal +
                '}';
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
}
