package datatTypes;

public class HomePosition implements Position{
    public HomePosition(int room, int floor, long houseID) {
        this.room = room;
        this.floor = floor;
        this.houseID = houseID;
    }

    public int room;
    public int floor;
    public long houseID;
}
