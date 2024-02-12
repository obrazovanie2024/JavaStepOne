package homework3.introToOOP;

import homework3.introToOOP.builders.Flat;
import homework3.introToOOP.builders.Floor;
import homework3.introToOOP.builders.House;
import homework3.introToOOP.builders.Room;
import homework3.introToOOP.util.Utils;

public class ApplicationRunner {

    // генератор не дописан

    public static void main(String[] args) {

        House house = new House(
                1,
                Utils.generateFloors(
                        Utils.generateFlats(
                                Utils.generateRooms()
                        )
                )
        );

        printAllInfo(house);

        Room room = new Room(true);
        room.print();
        Flat flat = new Flat(1, new Room[]{room});
        flat.print();
        Floor floor = new Floor(1, new Flat[]{flat});
        floor.print();
        House house2 = new House(1, new Floor[]{floor});
        house2.print();

    }

    private static void printAllInfo(House house) {
        StringBuilder houseInfo = new StringBuilder(house.info()).append("\n");
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
