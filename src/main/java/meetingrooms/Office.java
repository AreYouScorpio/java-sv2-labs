package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    public List<MeetingRoom> meetingRoom = new ArrayList<>();

    public void addMeetingRoom(String name, int length, int width){

        MeetingRoom newOffice = new MeetingRoom(name, length, width);

        meetingRoom.add(newOffice);


        System.out.println("Az új tárgyaló hozzáadva. Adatai: " + newOffice.getName() + " " + newOffice.getLength() + " " + newOffice.getWidth());


            ;

    }


}

