package homework4.homework.Task2;

public class Galaxy implements SpaceObjectInterface {
    private final String name;
    private final boolean hasLivingPlanets;

    public Galaxy(String name, boolean hasLivingPlanets) {
        this.name = name;
        this.hasLivingPlanets = hasLivingPlanets;
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + this.getName() + ", " + "Цвет: " + this.stringLivingPlanets(isHasLivingPlanets()));
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
