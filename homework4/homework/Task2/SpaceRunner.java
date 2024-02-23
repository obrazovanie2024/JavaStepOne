package homework4.homework.Task2;

import homework4.homework.Task2.Planets.AlmostPlanet;
import homework4.homework.Task2.Planets.Planet;
import homework4.homework.Task2.Planets.Satellite;

public class SpaceRunner {
    public static void main(String[] args) {
        Galaxy galaxyMilkyWay = new Galaxy("Млечный путь", 1500000000, null, true);
        Galaxy galaxyAndromeda = new Galaxy("Андромеда", 800000000, null, false);
        Star theSun = new Star("Солнце", 1000000000, Colours.SUNNY_YELLOW, galaxyMilkyWay);
        Planet planetEarth = new Planet("Земля", 100000, Colours.SKY_BLUE, true, theSun);
        Satellite satelliteEarth = new Satellite("Месяц", 1250, Colours.BONE_WHITE, true, planetEarth);
        Planet planetMars = new Planet("Марс", 50000, Colours.SALMON_RED, true, theSun);
        Satellite satelliteMars = new Satellite("Деймос", 1250, Colours.VANTA_BLACK, true, planetMars);
        Planet planetVenus = new Planet("Венера", 150000, Colours.CRIMSON_RED, false, theSun);
        AlmostPlanet planetPluto = new AlmostPlanet("Плутон", 1000, Colours.SNOW_WHITE, false, theSun, true);
        AlmostPlanet planetCeres = new AlmostPlanet("Церера", 1000, Colours.SNOW_WHITE, false, theSun, false);
        System.out.println(planetPluto.getColour());
        satelliteEarth.printInfo();
        System.out.println(SpaceUtils.isStar(theSun));
        System.out.println(SpaceUtils.calculateGravity(galaxyAndromeda, planetCeres, 200000.0));
        System.out.println(planetMars.calculateDiameter(544));
        System.out.println(satelliteMars.compareMass(planetVenus));
        System.out.println(planetPluto);
        System.out.println(planetVenus);
    }
}
