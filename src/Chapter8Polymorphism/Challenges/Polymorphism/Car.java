package Chapter8Polymorphism.Challenges.Polymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void StartEngine(){
        System.out.println("Car -> startEngine");
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }

    public void drive(){
        System.out.println("Car-> driving, type is "+getClass().getSimpleName());
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void StartEngine() {
       System.out.printf("Gas-> All %d cylinders are fired up, Ready!%n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas-> usage exceeds the average: %.2f %n",avgKmPerLiter);
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void StartEngine() {
        System.out.printf("BEV-> switch %d kwh battery are fired up, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas-> usage exceeds the average: %.2f %n",avgKmPerCharge);
    }
}