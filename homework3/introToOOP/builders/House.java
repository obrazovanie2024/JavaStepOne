package homework3.introToOOP.builders;

public class House {
    private final int houseNumber;
    private final Floor[] floors;

     public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print() {
        System.out.println("House №" + getHouseNumber() + " contains " + getFloors().length + " floors");
    }

    public String info() {
        return "House №" + getHouseNumber() + " contains " + getFloors().length + " floors";
    }

}
