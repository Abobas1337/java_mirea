package vehicles;

public class ElectricCar extends Car {
    public int batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, String ownerName, int insuranceNumber, String engineType, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber, "Electric");
        this.engineType = engineType;
        this.batteryCapacity = batteryCapacity;
    }

    public String vehicleType()
    {
        return "Electric Car";
    }

    public int getBatteryCapacity()
    {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity)
    {
        this.batteryCapacity = batteryCapacity;
    }

    public String toString() {
        System.out.println(getLicense() + " " + getColor() + " " + getYear() + " ");
        System.out.println(getOwnerName() + " " + getInsuranceNumber() + " " + getEngineType() + " " + getBatteryCapacity());
        return super.toString();
    }
}



