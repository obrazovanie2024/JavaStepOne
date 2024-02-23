package homework4.homework.Task2.Planets;

import homework4.homework.Task2.Colours;
import homework4.homework.Task2.Planets.Planet;
import homework4.homework.Task2.SpaceObject;

public class Satellite extends SpaceObject {
    private final boolean isNatural;
    private final Planet parentPlanet;
    public Satellite(String name, int mass, Colours colour, boolean isNatural, Planet parentPlanet) {
        super(name, mass, colour);
        this.isNatural = isNatural;
        this.parentPlanet = parentPlanet;
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + this.getName() +
                ", " + "Цвет: " + this.getColour() +
                ", " + "Масса: " + this.getMass() +
                ", " + "По часовой: " + this.stringNatural(isNatural()));
    }

    @Override
    public String toString() {
        return "\nназвание спутника: " + this.getName() + "\nестественного происхождения: " + (this.isNatural ? "да" : "нет") + "\n";
    }

    private String stringNatural(boolean isNatural) {
        return isNatural ? "Да" : "Нет";
    }

    public boolean isNatural() {
        return isNatural;
    }

    public Planet getParentPlanet() {
        return parentPlanet;
    }
}
