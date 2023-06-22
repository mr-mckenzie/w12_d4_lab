import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private Guest guest2;
    private ArrayList<Guest> guests;

    @Before
    public void before(){
        guest = new Guest("Bob");
        guest2 = new Guest("Amy");
        guests = new ArrayList<>();
        guests.add(guest);
        guests.add(guest2);
        conferenceRoom = new ConferenceRoom(10, "The John McNeill Room");
    }

    @Test
    public void hasRoomName() {
        assertEquals("The John McNeill Room",conferenceRoom.getRoomName() );
    }

    @Test
    public void hasCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void hasGuests() {
        assertEquals(guests, conferenceRoom.getGuests());
    }
}
