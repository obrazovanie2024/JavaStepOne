package homework4.homework.Task2.SmallBodies;

import homework4.homework.Task2.Colours;
import homework4.homework.Task2.SpaceObject;

public class Asteroid extends SpaceObject {
    private final boolean dangerous;

    public Asteroid(String name, int mass, Colours colour, boolean dangerous) {
        super(name, mass, colour);
        this.dangerous = dangerous;
    }

    @Override
    public String toString() {
        return "\nназвание астероида: " + this.getName() + "\nстолкновение с объектом опасно: " + (this.dangerous ? "да" : "нет") + "\n";
    }

    public boolean isDangerous() {
        return dangerous;
    }
}
