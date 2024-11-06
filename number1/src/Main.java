import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yuan;
        double roubles;
        int digit;
        final double ROUBLES_PER_YUAN = 11.91;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во юаней");
        yuan = input.nextInt();
        roubles = yuan * ROUBLES_PER_YUAN;
        System.out.println(roubles);
        digit = yuan % 10;
        if (digit == 1)
            System.out.println(" китайский юань = " +roubles +" рублей" );
        if (digit == 2 || digit == 3 || digit == 4 )
            System.out.println(yuan +" китайских юаня =" + roubles +" рублей" );
        if (digit > 4)
            System.out.println(yuan + " китайских юаней = " +roubles+" рублей" );
        if (yuan == 0)
            System.out.println("Не правильно, попробуйте еще раз" );


    }
}