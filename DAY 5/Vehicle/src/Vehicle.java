public class Vehicle {
    protected String name;
    protected String with_engine;
    protected String type;

    public Vehicle() {
    }

    public Vehicle(String name, String with_engine) {
        this.name = name;
        this.with_engine = with_engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWith_engine() {
        return with_engine;
    }

    public void setWith_engine(String with_engine) {
        this.with_engine = with_engine;
    }

    public void identifyMySelf(){
        System.out.print("Hi i'm "+ this.name + ", ");
        System.out.print("My name is: " + this.type + ", ");
        System.out.print("My engine status is " + this.with_engine + ", ");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Parent of all vehicles");
        vehicle.setType("Gerobak");
        vehicle.setWith_engine("'no engine'");
        vehicle.identifyMySelf();
        System.out.println("");
        System.out.println("");

        Bikes bikes = new Bikes();

        //Pedal Bikes
        bikes.setName("Bikes");
        bikes.setType("Pedal Bikes");
        bikes.setWith_engine("'no engine'");
        bikes.setWheelCount(2);
        bikes.identifyMySelf();

        //Motor Bikes
        bikes.setName("Bikes");
        bikes.setType("Motor Bikes");
        bikes.setWith_engine("'with engine'");
        bikes.setWheelCount(2);
        bikes.identifyMySelf();

        Cars cars = new Cars();

        //Sport Cars
        cars.setName("Cars");
        cars.setType("Sport Cars");
        cars.setWith_engine("'with engine'");
        cars.setWheelCount(4);
        cars.setEngineType("VB");
        cars.identifyMySelf();

        //Pickup Cars
        cars.setName("Cars");
        cars.setType("Pickup Cars");
        cars.setWith_engine("'with engine'");
        cars.setWheelCount(4);
        cars.setEngineType("Solar");
        cars.identifyMySelf();

        Buses buses = new Buses();
        buses.setName("Buses");
        buses.setType("Trans Jakarta");
        buses.setWith_engine("'with engine'");
        buses.setWheelCount(4);
        buses.setPrivateBus("Public Bus");
        buses.identifyMySelf();

        buses.setName("Buses");
        buses.setType("School Buses");
        buses.setWith_engine("'with engine'");
        buses.setWheelCount(4);
        buses.setPrivateBus("Private Bus");
        buses.identifyMySelf();
    }
}

class Bikes extends Vehicle{
    private int wheelCount;

    public Bikes() {
    }

    public Bikes(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    public void identifyMySelf() {
        super.identifyMySelf();
        System.out.println("I have " + this.wheelCount + " wheel(s)");
    }
}
class Cars extends Vehicle{
    private int wheelCount;
    private String engineType;

    public Cars() {
    }

    public Cars(int wheelCount, String engineType) {
        this.wheelCount = wheelCount;
        this.engineType = engineType;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void identifyMySelf() {
        super.identifyMySelf();
        System.out.print("I have " + this.wheelCount + " wheel(s), ");
        System.out.println("My engine type: " + this.engineType);
    }
}

class Buses extends Vehicle{
    private int wheelCount;
    private String privateBus;

    public Buses() {
    }

    public Buses(int wheelCount, String privateBus) {
        this.wheelCount = wheelCount;
        this.privateBus = privateBus;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getPrivateBus() {
        return privateBus;
    }

    public void setPrivateBus(String privateBus) {
        this.privateBus = privateBus;
    }

    @Override
    public void identifyMySelf() {
        System.out.print("Hi i'm "+ super.name);
        System.out.print(" [" + this.privateBus + "], ");
        System.out.print("My name is: " + super.type + ", ");
        System.out.print("My engine status is " + super.with_engine + ", ");
        System.out.println("I have " + this.wheelCount + " wheel(s), ");
    }
}