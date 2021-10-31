package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class Hardware {

    String name;
    String model;

    public Hardware(String name, String model) {
        this.name = name;
        this.model = model;


    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Hardware{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
