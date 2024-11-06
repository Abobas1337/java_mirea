package app;
import vehicles.ElectricCar;
import vehicles.Car;

public class TestCar
{
    public static void main(String[] args)
    {
        Car car = new Car("Lada vesta", "314141", "black", 2017, "Borya", 44444444, "Samogon");
        ElectricCar Elcar = new ElectricCar("Marussia", "124123", "white-gray", 2010, "Nikolay Flomenko", 01042014, "Electric", 2204);
        car.setYear(2010);
        car.setOwnerName("Stepashka");
        Elcar.setYear(2020);
        Elcar.setOwnerName("Anton Kolesnikov");
        car.setInsuranceNumber(1006973);
        Elcar.setInsuranceNumber(8765432);

        Elcar.setBatteryCapacity(243243);
        System.out.println(Elcar.getBatteryCapacity());

        car.toString();
        Elcar.toString();

    }
}