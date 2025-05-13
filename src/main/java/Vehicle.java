public class Vehicle {
    private String vinNumber;
    private String licensePlate;
    private String licenseType;
    private int speed;
    private int capacity;
    private String fuelType;
    private String make;
    private String model;
    private double weight;
    private boolean hasGPS;
    private boolean engineType; // true = electric, false = combustion
    private int maxCapacity;
    private String color;
    private TerrainType terrain;
    private double fuelCapacity;
    private double speedometer;

    // Action methods
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void deAccelerate() {
        System.out.println("Decelerating...");
    }

    public void electronicBrake() {
        System.out.println("Electronic brake applied.");
    }

    public Vehicle(String vinNumber, String licenseType, String licensePlate, int capacity, String fuelType, String make, String model, double weight, boolean hasGPS, boolean engineType, int maxCapacity, String color, TerrainType terrain, double fuelCapacity) {
        this.vinNumber = vinNumber;
        this.licenseType = licenseType;
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.hasGPS = hasGPS;
        this.engineType = engineType;
        this.maxCapacity = maxCapacity;
        this.color = color;
        this.terrain = terrain;
        this.fuelCapacity = fuelCapacity;
    }

    // Getters and Setters
    public String getVinNumber() {
        return vinNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public boolean hasGps() {
        return hasGPS;
    }

    public boolean isEngineType() {
        return engineType;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String getColor() {
        return color;
    }

    public TerrainType getTerrain() {
        return terrain;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getSpeedometer() {
        return speedometer;
    }

    public void setSpeedometer(double speedometer) {
        this.speedometer = speedometer;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vinNumber='" + vinNumber + '\'' + ", licensePlate='" + licensePlate + '\'' + ", licenseType='" + licenseType + '\'' + ", speed=" + speed + ", capacity=" + capacity + ", fuelType='" + fuelType + '\'' + ", make='" + make + '\'' + ", model='" + model + '\'' + ", weight=" + weight + ", hasGPS=" + hasGPS + ", engineType=" + engineType + ", maxCapacity=" + maxCapacity + ", color='" + color + '\'' + ", terrain=" + terrain + ", fuelCapacity=" + fuelCapacity + ", speedometer=" + speedometer + '}';
    }
}
