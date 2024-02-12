package homework3.introToOOP;

public class Room {
    private boolean isPassage;

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
