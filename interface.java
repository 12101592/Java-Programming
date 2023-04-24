// Interface Vehicle
interface Vehicle {
    void gearChange(int x);
    void speedIncrease(int x);
    void brakes(int x);
}

// Class Bike implementing Vehicle interface
class Bike implements Vehicle {
    private int gear;
    private int speed;

    public Bike() {
        this.gear = 0;
        this.speed = 0;
    }

    public void gearChange(int x) {
        this.gear = x;
    }

    public void speedIncrease(int x) {
        this.speed += x;
    }

    public void brakes(int x) {
        this.speed -= x;
    }

    public void printState() {
        System.out.println("Bike speed: " + this.speed);
        System.out.println("Bike gear: " + this.gear);
    }
}

// Class Car implementing Vehicle interface
class Car implements Vehicle {
    private int gear;
    private int speed;

    public Car() {
        this.gear = 0;
        this.speed = 0;
    }

    public void gearChange(int x) {
        this.gear = x;
    }

    public void speedIncrease(int x) {
        this.speed += x;
    }

    public void brakes(int x) {
        this.speed -= x;
    }

    public void print() {
        System.out.println("Car speed: " + this.speed);
        System.out.println("Car gear: " + this.gear);
    }
}
public class Main {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        Car myCar = new Car();

        myBike.gearChange(2);
        myBike.speedIncrease(30);
        myBike.brakes(5);
        myBike.printState();

        myCar.gearChange(3);
        myCar.speedIncrease(60);
        myCar.brakes(10);
        myCar.print();
    }
}
