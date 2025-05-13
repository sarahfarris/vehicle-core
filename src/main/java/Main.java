public class Main {
    public static void main(String[] args) {

        Car car = new Car("x", "x", "x", 1, "x", "x", "x", 1, true, true, 1, "x", TerrainType.LAND, 10);

        Hovercraft hovercraft = new Hovercraft("y", "y", "y", 1, "y", "y", "y", 1, true, true, 1, "y", TerrainType.WATER, 10);

        Moped moped = new Moped("z", "z", "z", 1, "z", "z", "z", 1, true, true, 1, "z", TerrainType.AIR, 10);

        SemiTruck semiTruck = new SemiTruck("a", "a", "a", 1, "a", "a", "a", 1, true, true, 1, "a", TerrainType.MIXED, 10);

        System.out.println("********** car ********** ");
        System.out.println(car);
        System.out.println("********** hovercraft ********** ");
        System.out.println(hovercraft);
        System.out.println("********** moped ********** ");
        System.out.println(moped);
        System.out.println("********** semiTruck ********** ");
        System.out.println(semiTruck);
    }
}

