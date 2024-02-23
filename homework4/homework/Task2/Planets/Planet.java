package homework4.homework.Task2.Planets;

import homework4.homework.Task2.Colours;
import homework4.homework.Task2.SpaceObject;
import homework4.homework.Task2.Star;

public class Planet extends SpaceObject {
    private final boolean hasSatellite;
    private final Star star;
    public Planet(String name, int mass, Colours colour, boolean hasSatellite, Star star) {
        super(name, mass, colour);
        this.hasSatellite = hasSatellite;
        this.star = star;
    }

    @Override
    public String toString() {
        return "\nназвание планеты: " + this.getName() + "\nесть спутник: " + (this.hasSatellite ? "да" : "нет") + "\n";
    }

    public boolean isHasSatellite() {
        return hasSatellite;
    }

    public Star getStar() {
        return star;
    }
}
