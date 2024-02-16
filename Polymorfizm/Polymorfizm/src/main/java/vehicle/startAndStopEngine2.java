package vehicle;

public class startAndStopEngine2 {
    private Vehicle vehicle;

    public startAndStopEngine2(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void getCustomer1(){
        vehicle.startEngine();
        vehicle.stopEngine();
    }
}
