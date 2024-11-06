import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Введите цифру от 1 до 12:");

            if (scanner.hasNextInt())
            {
                int month = scanner.nextInt();

                try
                {
                    if (month == 2)
                    {
                        System.out.println("Вы выбрали Февраль, введите год:");
                        if (scanner.hasNextInt())
                        {
                            int year = scanner.nextInt();
                            if (isLeapYear(year))
                            {
                                System.out.println("Месяц: " + months[month - 1]);
                                System.out.println("День: 29 (Весокосный год)");
                            } else
                            {
                                System.out.println("Месяц: " + months[month - 1]);
                                System.out.println("День: 28 (Не весокосный год)");
                            }
                        } else
                        {
                            System.out.println("Неправильный ввод");
                            scanner.next();
                        }
                    } else
                    {
                        System.out.println("Месяц: " + months[month - 1]);
                        System.out.println("День: " + daysOfMonth[month - 1]);
                    }
                } catch (ArrayIndexOutOfBoundsException ex)
                {
                    System.out.println("Не правильный ввод!");
                }
            } else
            {
                System.out.println("Не правильный ввод?");
                scanner.next();
            }
        }
    }

    public static boolean isLeapYear(int year)
    {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}