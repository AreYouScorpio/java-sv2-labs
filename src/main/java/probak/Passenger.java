package probak;

public class Passenger {
    String name;
    String ticket;
    int pack;


    public Passenger(String name, String ticket, int pack) {
        this.name = name;
        this.ticket = ticket;
        this.pack = pack;
    }


    public String getName() {
        return name;
    }

    public String getTicket() {
        return ticket;
    }

    public int getPack() {
        return pack;
    }
}
