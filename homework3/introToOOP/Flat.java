package homework3.introToOOP;

public class Flat {
    private int flatNumber;
    private Room[] rooms;

    Flat(int flatNumber, Room[] rooms) {
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
