package homework4.homework.Task2;

public final class SpaceUtils {
    static final double SOME_FICTIONAL_GRAVITY_FACTOR = 0.007;
    private SpaceUtils() {

    }

    public static double calculateGravity(SpaceObject spaceObject1, SpaceObject spaceObject2, double distanceBetweenObjects) {
        double spaceObject1Mass = spaceObject1.getMass();
        double spaceObject2Mass = spaceObject2.getMass();

        return (1.0 / distanceBetweenObjects) * (spaceObject1Mass * SOME_FICTIONAL_GRAVITY_FACTOR) + (spaceObject2Mass * SOME_FICTIONAL_GRAVITY_FACTOR);
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }
}
