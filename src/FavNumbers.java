import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favNumber;
        double favNumber2 ;
        favNumber = SafeInput.getInt(in, "Enter your favorite integer");
        favNumber2 = SafeInput.getDouble(in, "Enter your favorite decimal");
        System.out.println("\nYour favorite integer is "+favNumber+" You favorite decimal is "+favNumber2);
    }
}
