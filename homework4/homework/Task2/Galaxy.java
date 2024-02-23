package homework4.homework.Task2;

public class Galaxy extends SpaceObject implements SpaceObjectInterface {
    private final String name;
    private final boolean hasLivingPlanets;

    public Galaxy(String name, int mass, Colours colour, boolean hasLivingPlanets) {
        super(name, mass, colour);
        this.name = name;
        this.hasLivingPlanets = hasLivingPlanets;
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + this.getName() + ", " + "Цвет: " + this.stringLivingPlanets(isHasLivingPlanets()));
    }

    @Override
    public String toString() {
        return "\nназвание галактики: " + this.getName() + "\nимеет живые планеты: " + (this.hasLivingPlanets ? "да" : "нет") + "\n";
    }

    private String stringLivingPlanets(boolean hasLivingPlanets) {
        return hasLivingPlanets ? "Да" : "Нет";
    }

    public String getName() {
        return name;
    }

    public boolean isHasLivingPlanets() {
        return hasLivingPlanets;
    }
}
