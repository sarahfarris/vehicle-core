public class SemiTruck extends Vehicle {
    private double cargoCapacity;

    public SemiTruck(String vinNumber, String licenseType, String licensePlate, int capacity, String fuelType, String make, String model, double weight, boolean hasGPS, boolean engineType, int maxCapacity, String color, TerrainType terrain, double fuelCapacity) {
        super(vinNumber, licenseType, licensePlate, capacity, fuelType, make, model, weight, hasGPS, engineType, maxCapacity, color, terrain, fuelCapacity);
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void attachTrailer() {
        System.out.println("Trailer attached to semi-truck.");
    }
}
