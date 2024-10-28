import java.util.Scanner;

class CheckOut{
    public static void main(String[] args){
        boolean done = false;
        double total = 0.00;
        Scanner input = new Scanner(System.in);
        do{
            double price=SafeInput.getRangedDouble(input,"What is the price of the item",0.5,10);
            total +=price;
            done = !SafeInput.getYNconfirm(input,"Do you want to add more items");
        }while (!done);
        System.out.printf("Your total amount is: %.2f",total);

    }
}