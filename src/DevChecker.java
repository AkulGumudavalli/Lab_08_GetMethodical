import java.util.Scanner;

class DevChecker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(SafeInput.getregExString(input,"Enter your SSN","\\d{3}-\\d{2}-\\d{4}"));

    }
}