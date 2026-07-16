package Day_06;

class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key/button");
    }
}

public class VehilceDemo {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.start();

        Car c = new Car();
        c.start();

    }
}