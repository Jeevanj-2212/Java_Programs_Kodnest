package interfaces;

interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving.");
    }
}

public class Transport {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.drive();  // Outputs: Car is driving.
    }
}
