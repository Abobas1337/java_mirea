import vehicles.ElectricCar;
import vehicles.Car;


public class Main {
    public static void main(String[] args) {
        Car car=new Car("BMW", "282.4", "Black", 1984, "Brother", 105228, "Brutal");
        System.out.println(car.vehicleType());
        car.setModel("fr");
        System.out.println(car.getModel());
        System.out.println(car.getLicense());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
        System.out.println(car.getOwnerName());
        System.out.println(car.getInsuranceNumber());
        ElectricCar ELcar=new ElectricCar("bk", "105.2", "pink", 1994, "Chikatilo", 884122, "Electric", 501);
        System.out.println(ELcar.vehicleType());
        ELcar.setBatteryCapacity(504);
        System.out.println(ELcar.getModel());

        System.out.println(ELcar.getLicense());
        System.out.println(ELcar.getColor());
        System.out.println(ELcar.getYear());
        System.out.println(ELcar.getOwnerName());
        System.out.println(ELcar.getInsuranceNumber());
        System.out.println(ELcar.batteryCapacity);
    }
}