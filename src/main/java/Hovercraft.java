public class Hovercraft extends Vehicle {
    private boolean canHoverOverWater;

    public Hovercraft(String vinNumber, String licenseType, String licensePlate, int capacity, String fuelType, String make, String model, double weight, boolean hasGPS, boolean engineType, int maxCapacity, String color, TerrainType terrain, double fuelCapacity) {
        super(vinNumber, licenseType, licensePlate, capacity, fuelType, make, model, weight, hasGPS, engineType, maxCapacity, color, terrain, fuelCapacity);
    }

    public boolean canHoverOverWater() {
        return canHoverOverWater;
    }

    public void setCanHoverOverWater(boolean canHoverOverWater) {
        this.canHoverOverWater = canHoverOverWater;
    }

    public void engageLiftSystem() {
        System.out.println("Lift system engaged.");
    }
}
