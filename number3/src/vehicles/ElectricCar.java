package vehicles;

public class ElectricCar extends Car
{
    private int batteryCapacity;


    public ElectricCar(String ownerName, int insuranceNumber,  int batteryCapacity) {
        super(ownerName, insuranceNumber, "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
