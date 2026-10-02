package Chapter8Polymorphism.Challenges.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari",15.6,6);
        runRace(ferrari);

    }
    public static void runRace(Car car){

        car.StartEngine();
        car.drive();
    }
}
