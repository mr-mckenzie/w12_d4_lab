import java.awt.print.Book;

public class Booking {
    private Bedroom bedroom;
    private int numberOfNightsBooked;

    private double totalBill;

    public Booking (Bedroom bedroom, int numberOfNightsBooked){
        this.bedroom = bedroom;
        this.numberOfNightsBooked = numberOfNightsBooked;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getNumberOfNightsBooked() {
        return this.numberOfNightsBooked;
    }

    public double getTotalBill() {
        return this.numberOfNightsBooked * this.bedroom.getNightlyRate();
    }
}
