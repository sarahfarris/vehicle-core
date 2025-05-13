public class Moped extends Vehicle {
    private boolean hasPedals;

    public Moped(String vinNumber, String licenseType, String licensePlate, int capacity, String fuelType, String make, String model, double weight, boolean hasGPS, boolean engineType, int maxCapacity, String color, TerrainType terrain, double fuelCapacity) {
        super(vinNumber, licenseType, licensePlate, capacity, fuelType, make, model, weight, hasGPS, engineType, maxCapacity, color, terrain, fuelCapacity);
    }

    public boolean hasPedals() {
        return hasPedals;
    }

    public void setHasPedals(boolean hasPedals) {
        this.hasPedals = hasPedals;
    }

    public void kickStart() {
        System.out.println("Moped kickstarted.");
    }
}
