package homework4.homework.Task2;

public class Star extends SpaceObject {
    private final Galaxy galaxy;
    public Star(String name, int mass, Colours colour, Galaxy galaxy) {
        super(name, mass, colour);
        this.galaxy = galaxy;
    }
    @Override
    public String toString() {
        return "\nназвание объекта: " + this.getName() + "\nотносится к галактике: " + this.galaxy.getName() + "\n";
    }

    public Galaxy getGalaxy() {
        return galaxy;
    }
}
