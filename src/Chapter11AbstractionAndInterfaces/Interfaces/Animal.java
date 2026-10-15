package Chapter11AbstractionAndInterfaces.Interfaces;

class Satellite implements orbitEarth {

    public void achieveOrbit(){
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

enum FlightStages implements Trackable {GROUNDED,LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {

        if(this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }
}

record Dragonfly(String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface orbitEarth extends FlightEnabled{

    void achieveOrbit();

    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + ": "+description);
    }
}

interface FlightEnabled{

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    public abstract void takeOff();
    abstract void land();
    void fly();

    default FlightStages transition(FlightStages stage){
        System.out.println("transition not implemented on "
        +  getClass().getName());
        return null;
    }

}

interface Trackable{

    void track();
}

        public abstract class Animal {

            public abstract void move();
    }
