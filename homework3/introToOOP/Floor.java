package homework3.introToOOP;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void print() {
        System.out.println("Floor №" + getFloorNumber() + " contains " + getFlats().length + " flats");
    }

    public String info() {
        return "Floor №" + (getFloorNumber() + 1) + " contains " + getFlats().length + " flats";
    }

}
