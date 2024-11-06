package App;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main
{
    public static void main(String[] args) {
        Car myCar = new Car("Академик", 1711052, "На силе воли");
        System.out.println("Владелец: " + myCar.getOwnerName());
        System.out.println("Страховой номер: " + myCar.getInsuranceNumber());
        System.out.println("Тип двигателя: " + myCar.getEngineType());

        ElectricCar myElectricCar = new ElectricCar("Китаец", 2210000, 15041989);
        System.out.println("Владелец электромобиля: " + myElectricCar.getOwnerName());
        System.out.println("Страховой номер: " + myElectricCar.getInsuranceNumber());
        System.out.println("Тип двигателя: " + myElectricCar.getEngineType());
        System.out.println("Емкость батареи: " + myElectricCar.getBatteryCapacity());

        myElectricCar.setBatteryCapacity(4061989);
        System.out.println("Размер новой батареи: " + myElectricCar.getBatteryCapacity());
    }

}
