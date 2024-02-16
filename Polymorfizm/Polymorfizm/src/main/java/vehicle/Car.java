package vehicle;

public class Car extends Vehicle {

    public int araba1;

    @Override
    public void startEngine() {
        System.out.println("Car engine started with a kick- start.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped when ignition was turned off.");
    }
}
