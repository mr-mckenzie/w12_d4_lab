import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(9, RoomType.TRIPLE, 80);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void bookingHasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void bookingHasNumberOfNights() {
        assertEquals(3, booking.getNumberOfNightsBooked());
    }

    @Test
    public void hasTotalBooking() {
        assertEquals(240, booking.getTotalBill(), 0.0);
    }

}
