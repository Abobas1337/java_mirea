public class Main
{
    public static void main(String[]args)
    {
        int year2 = 2024;
        Car bmw = new Car("BMW", "BO158P78", "black", 1980);
        Car mers = new Car("Mersedes-Bens", "BO105Y98", "Blue", 2014);
        System.out.println (bmw);
        System.out.println(bmw.old(year2));
        System.out.println (mers.toString());
        System.out.println(mers.old(year2));
    }
}