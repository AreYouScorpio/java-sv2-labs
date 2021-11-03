package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    List<MeetingRoom> meetingRoom = new ArrayList<>();

    public void addMeetingRoom(String name, int length, int width){

        MeetingRoom newOffice = new MeetingRoom(name, length, width);

        meetingRoom.add(newOffice);

        System.out.println("Az új tárgyaló hozzáadva. Adatai: " + newOffice.getName() + " " + newOffice.getLength() + " " + newOffice.getWidth());
        System.out.println("Az új teljes tárgyaló lista adatai: ");
        for (int i=0; i<meetingRoom.size(); i++){
            System.out.println(meetingRoom.get(i).getName());
            System.out.println(meetingRoom.get(i).getLength());
            System.out.println(meetingRoom.get(i).getWidth());
        }
            ;

    }


}

