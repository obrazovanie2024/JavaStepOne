package homework3.introToOOP.builders;

public class Room {
    private final boolean isPassage;

    public Room(boolean isPassage) {
        this.isPassage = isPassage;
    }

    public boolean isPassage() {
        return isPassage;
    }

    public void print() {
        if (isPassage()) {
            System.out.println("Room is passage");
        } else {
            System.out.println("Room is not passage");
        }
    }

    public String info() {
        if (isPassage()) {
            return "Room is passage";
        } else {
            return "Room is not passage";
        }
    }

}
