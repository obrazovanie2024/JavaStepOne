package homework4.homework.Task2;

public class SpaceRunner {
    public static void main(String[] args) {
        Galaxy solarSystem = new Galaxy("Солнечная система", true);
        Moon moonEarth = new Moon("Месяц", 1250, Colours.BONE_WHITE, true);
        Planet planetEarth = new Planet("Земля", 100000, Colours.SKY_BLUE, true);
        Moon moonMars = new Moon("Деймос", 1250, Colours.VANTA_BLACK, false);
        Planet planetMars = new Planet("Марс", 50000, Colours.SALMON_RED, true);
        Planet planetVenus = new Planet("Марс", 150000, Colours.CRIMSON_RED, false);
        AlmostPlanet pluto = new AlmostPlanet("Плутон", 1000, Colours.SNOW_WHITE, false, true);
        System.out.println(pluto.getColour());
        moonEarth.printInfo();
    }
}
