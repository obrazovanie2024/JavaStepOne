package homework3.introToOOP.builders;

public class Flat {
    private final int flatNumber;
    private final Room[] rooms;

     public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Flat №" + getFlatNumber() + " contains " + getRooms().length + " rooms");
    }

    public String info() {
        return "Flat №" + (getFlatNumber() + 1) + " contains " + getRooms().length + " rooms";
    }

}
