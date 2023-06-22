public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4);

    private final int occupancy;

    RoomType(int occupancy){
        this.occupancy = occupancy;
    }

    public int getOccupancy(){
        return this.occupancy;
    }
}
