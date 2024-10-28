import java.util.Scanner;

class Reggie{
    public static void main(String[] args){
        String SNNRegx = "^\\d{3}-\\d{2}-\\d{4}$";
        String StudentRegx = "^(M|m)\\d{5}$";
        String menuChoiceRegx = "^[OoSsVvQq]$";
        Scanner input= new Scanner(System.in);
        String SSN = SafeInput.getregExString(input,"What is your SSN",SNNRegx);
        String studentNumber=SafeInput.getregExString(input,"What is your Student id",StudentRegx);
        String menuChoice = SafeInput.getregExString(input,"What is your Menu Choice",menuChoiceRegx);
        System.out.println(SSN);
        System.out.println(studentNumber);
        System.out.println(menuChoice);

    }
}