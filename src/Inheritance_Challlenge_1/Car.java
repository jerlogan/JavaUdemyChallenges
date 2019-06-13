package Inheritance_Challlenge_1;

public class Car extends Vehicle {
    int steeringWheel;
    String color;

    public Car(int speed, int engine, int wheels, int steeringWheel, String color) {
        super(speed, engine, wheels);
        this.speed = 60;
        this.engine = 6;
        this.wheels = 4;
    }

    public void changeGears() {
        System.out.println("The car is changing gears.");
    }

    @Override
    public void move () {
        System.out.println("The car is moving at " + speed + " mph.");
    }

}
