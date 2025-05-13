public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String vinNumber, String licenseType, String licensePlate, int capacity, String fuelType, String make, String model, double weight, boolean hasGPS, boolean engineType, int maxCapacity, String color, TerrainType terrain, double fuelCapacity) {
        super(vinNumber, licenseType, licensePlate, capacity, fuelType, make, model, weight, hasGPS, engineType, maxCapacity, color, terrain, fuelCapacity);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void playRadio() {
        System.out.println("Playing music on the car radio.");
    }
}
