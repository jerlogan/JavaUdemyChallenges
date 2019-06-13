package Inheritance_Challlenge_1;

public class Vehicle {
    public int speed;
    public int engine;
    public int wheels;

    public Vehicle(int speed, int engine, int wheels){
        this.speed = speed;
        this.engine = engine;
        this.wheels = wheels;
    }
    public void move(){
        System.out.println("The vehicle is moving.");
    }
}
