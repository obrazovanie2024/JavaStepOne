package homework4.homework.Task2;

public class Moon extends SpaceObject {
    private final boolean isClockwise;
    public Moon(String name, int mass, Colours colour, boolean isClockwise) {
        super(name, mass, colour);
        this.isClockwise = isClockwise;
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + this.getName() +
                ", " + "Цвет: " + this.getColour() +
                ", " + "Масса: " + this.getMass() +
                ", " + "По часовой: " + this.stringClockwise(isClockwise()));
    }

    private String stringClockwise(boolean isClockwise) {
        return isClockwise ? "Да" : "Нет";
    }

    public boolean isClockwise() {
        return isClockwise;
    }
}
