package Inheritance_Challlenge_1;

public class Ferrari extends Car {
    int yearMade;
    public Ferrari(int speed, int engine, int wheels, int steeringWheel, String color, int yearMade) {
        super(speed, engine, wheels, steeringWheel, color);
        this.yearMade = 2019;
        this.speed = 140;
        this.engine = 8;
    }

    @Override
    public void changeGears() {
        System.out.println("The Ferrari is changing gears!");
    }
}
