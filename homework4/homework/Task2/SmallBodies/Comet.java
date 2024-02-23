package homework4.homework.Task2.SmallBodies;

import homework4.homework.Task2.Colours;
import homework4.homework.Task2.SpaceObject;

public class Comet extends SpaceObject {
    private final boolean hasTail;
    public Comet(String name, int mass, Colours colour, boolean hasTail) {
        super(name, mass, colour);
        this.hasTail = hasTail;
    }

    @Override
    public String toString() {
        return "\nназвание кометы: " + this.getName() + "\nимеет хвост: " + (this.hasTail ? "да" : "нет") + "\n";
    }

    public boolean isHasTail() {
        return hasTail;
    }
}
