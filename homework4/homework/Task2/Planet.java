package homework4.homework.Task2;

public class Planet extends SpaceObject {
    private final boolean hasMoon;
    public Planet(String name, int mass, Colours colour, boolean hasMoon) {
        super(name, mass, colour);
        this.hasMoon = hasMoon;
    }

    public boolean isHasMoon() {
        return hasMoon;
    }
}
