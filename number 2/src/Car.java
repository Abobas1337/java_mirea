import java.util.Objects;
public class Car {
    public String model;
    public String license;
    public String color;
    public int year;

    public Car(String model, String license, String color, int year)
    {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString()
    {
        return ("Model: " + model + "\n" + "Licence: " + license + "\n" + "Year:" + year);
    }
    public int old(int year2)
    {
        return year2 - year;
    }

}