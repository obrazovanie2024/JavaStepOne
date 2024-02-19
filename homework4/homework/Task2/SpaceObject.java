package homework4.homework.Task2;

public abstract class SpaceObject implements SpaceObjectInterface {
    private final String name;
    private final int mass;
    private final Colours colour;

    public SpaceObject(String name, int mass, Colours colour) {
        this.name = name;
        this.mass = mass;
        this.colour = colour;
    }

    public void printInfo() {
        System.out.println("Имя: " + this.getName() + ", " + "Цвет: " + this.getColour() + ", " + "Масса: " + this.getMass());
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public Colours getColour() {
        return colour;
    }
}
