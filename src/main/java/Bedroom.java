import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;

    public Bedroom (int roomNumber, RoomType roomType, double nightlyRate){
        super(roomType.getOccupancy());
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }
}
