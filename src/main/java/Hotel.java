import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedroomArrayList;
    private ArrayList<ConferenceRoom> conferenceRoomArrayList;

    public Hotel(ArrayList<Bedroom> bedroomArrayList, ArrayList<ConferenceRoom> conferenceRoomArrayList) {
        this.bedroomArrayList = bedroomArrayList;
        this.conferenceRoomArrayList = conferenceRoomArrayList;
    }

    public ArrayList<Bedroom> getBedroomArrayList() {
        return this.bedroomArrayList;
    }


    public void checkInGuest(Guest guest, Bedroom bedroom) {
        bedroom.addGuests(guest);
    }

    public void checkOutGuest(Bedroom bedroom) {
        bedroom.removeGuests();
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights) {
        return new Booking(bedroom, numberOfNights);
    }
}
