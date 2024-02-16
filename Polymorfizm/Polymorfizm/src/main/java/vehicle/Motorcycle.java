package vehicle;

public class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a kick-start.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped when ignition was turned off.");
    }

}
