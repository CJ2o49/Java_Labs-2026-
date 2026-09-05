public class vehiclesound {

    void makeSound() {
        System.out.println("Vehicle makes a sound.");
    }
}

class MotorVehicle extends vehiclesound {

    @Override
    void makeSound() {
        System.out.println("Bike sound.");
    }
}

class Car extends MotorVehicle {

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Car sound.");
    }

    public static void main(String[] args) {

        vehiclesound vehicle = new Car();

        vehicle.makeSound();
    }
}