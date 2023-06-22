import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.html.HTMLObjectElement;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest1;
    Guest guest2;


    @Before
    public void before() {
        guest1 = new Guest("Alan");
        guest2 = new Guest("Pam");
        ArrayList<Guest> guestArrayList1 = new  ArrayList<>();
        ArrayList<Guest> guestArrayList2 = new ArrayList<>();


        bedroom1 = new Bedroom(20, RoomType.SINGLE, 35);
        bedroom2 = new Bedroom(7, RoomType.DOUBLE, 55);

        ArrayList<Bedroom> bedroomArrayList = new ArrayList<>();
        bedroomArrayList.add(bedroom1);
        bedroomArrayList.add(bedroom2);

        ArrayList<ConferenceRoom> conferenceRoomArrayList = new ArrayList<>();
        conferenceRoom1 = new ConferenceRoom(25, "The Colette Room");
        conferenceRoom2 = new ConferenceRoom( 50, "The Jack Room");
        conferenceRoomArrayList.add(conferenceRoom1);
        conferenceRoomArrayList.add(conferenceRoom2);

        hotel = new Hotel(bedroomArrayList, conferenceRoomArrayList);
    }

    @Test
    public void checkRoomIsEmpty() {
        assertEquals(0, hotel.getBedroomArrayList().get(1).getGuests().size());
    }

    @Test
    public void canAddGuestsToRoom() {
        hotel.checkInGuest(guest1, bedroom2);
        hotel.checkInGuest(guest2, bedroom2);
        assertEquals(2, bedroom2.getGuests().size());
    }

    @Test
    public void canCheckOutGuests() {
        hotel.checkInGuest(guest1, bedroom2);
        hotel.checkInGuest(guest2, bedroom2);
        hotel.checkOutGuest(bedroom2);
        assertEquals(0, bedroom2.getGuests().size());

    }

    @Test
    public void canBookRoom() {
        Booking newBooking = hotel.bookRoom(bedroom2, 5);
        assertEquals(bedroom2, newBooking.getBedroom());
        assertEquals(5, newBooking.getNumberOfNightsBooked());
    }

}



