package homework3.introToOOP;

import java.util.Random;

public class Utils {

    private static final int ROOM_NUMBER_MIN_INCLUDED = 1;
    private static final int ROOM_NUMBER_MAX_EXCLUDED = 4;
    private static final int FLAT_NUMBER_MIN_INCLUDED = 4;
    private static final int FLAT_NUMBER_MAX_EXCLUDED = 7;
    private static final int FLOOR_NUMBER_MIN_INCLUDED = 5;
    private static final int FLOOR_NUMBER_MAX_EXCLUDED = 10;

    public static Room[] generateRooms() {
        int number = randomInteger(ROOM_NUMBER_MIN_INCLUDED, ROOM_NUMBER_MAX_EXCLUDED);
        Room[] rooms = new Room[number];
        for (int i = 0; i < number; i++) {
            rooms[i] = new Room(randomBoolean());
        }
        return rooms;
    }

    public static Flat[] generateFlats(Room[] rooms) {
        int number = randomInteger(FLAT_NUMBER_MIN_INCLUDED, FLAT_NUMBER_MAX_EXCLUDED);
        Flat[] flats = new Flat[number];
        for (int i = 0; i < number; i++) {
            flats[i] = new Flat(i, rooms);
        }
        return flats;
    }

    public static Floor[] generateFloors(Flat[] flats) {
        int number = randomInteger(FLOOR_NUMBER_MIN_INCLUDED, FLOOR_NUMBER_MAX_EXCLUDED);
        Floor[] floors = new Floor[number];
        for (int i = 0; i < number; i++) {
            floors[i] = new Floor(i, flats);
        }
        return floors;
    }

    public static int randomInteger(int includedFrom, int exceptedTo) {
        Random random = new Random();
        return random.nextInt(includedFrom, exceptedTo);
    }

    public static boolean randomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static void printAllInfo(House house) {
        StringBuilder houseInfo = new StringBuilder(house.info());
        for (Floor floor : house.getFloors()) {
            houseInfo.append("\t").append(floor.info()).append("\n");
            for (Flat flat : floor.getFlats()) {
                houseInfo.append("\t\t").append(flat.info()).append("\n");
                for (Room room : flat.getRooms()) {
                    houseInfo.append("\t\t\t").append(room.info()).append("\n");
                }
            }
        }
        System.out.println(houseInfo);
    }

}
