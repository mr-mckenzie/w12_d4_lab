import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;
    private ArrayList<Guest> guests;

    @Before
    public void before(){
        guest = new Guest("Bob");
        guests = new ArrayList<>();
        guests.add(guest);
        bedroom = new Bedroom(12, RoomType.FAMILY, 100);
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.FAMILY, bedroom.getRoomType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(12, bedroom.getRoomNumber());
    }

    @Test
    public void canAddGuests() {
        bedroom.addGuests(guest);
        assertEquals(guests, bedroom.getGuests());
    }

    @Test
    public void canRemoveGuests() {
        bedroom.addGuests(guest);
        assertEquals(guests, bedroom.getGuests());
        bedroom.removeGuests();
        assertEquals(0, bedroom.getGuests().size());
    }
}
