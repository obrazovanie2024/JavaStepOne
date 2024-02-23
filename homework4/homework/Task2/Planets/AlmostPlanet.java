package homework4.homework.Task2.Planets;

import homework4.homework.Task2.Colours;
import homework4.homework.Task2.Star;

public class AlmostPlanet extends Planet {
    private final boolean farFromSun;
    public AlmostPlanet(String name, int mass, Colours colour, boolean hasMoon, Star star, boolean farFromSun) {
        super(name, mass, colour, hasMoon, star);
        this.farFromSun = farFromSun;
    }

    @Override
    public String toString() {
        return "\nназвание почти-планеты: " + this.getName() + "\nобъект далеко от Солнца: " + (this.farFromSun ? "да" : "нет") + "\n";
    }

    public boolean isFarFromSun() {
        return farFromSun;
    }

}
