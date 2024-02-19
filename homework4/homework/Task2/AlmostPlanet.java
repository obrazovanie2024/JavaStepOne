package homework4.homework.Task2;

public class AlmostPlanet extends Planet {
    private final boolean farFromSun;
    public AlmostPlanet(String name, int mass, Colours colour, boolean hasMoon, boolean farFromSun) {
        super(name, mass, colour, hasMoon);
        this.farFromSun = farFromSun;

    }

    public boolean isFarFromSun() {
        return farFromSun;
    }
}
