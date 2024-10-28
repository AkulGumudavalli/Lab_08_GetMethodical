import java.util.Scanner;

public class BirthDateTime{
    public static void main(String[] Args) {
        int year;
        int month;
        int day;
        int hours;
        int minutes;
        Scanner input = new Scanner(System.in);
        year = SafeInput.getRangedInt(input,"What is your birth year",1900,2025);
        month = SafeInput.getRangedInt(input,"What is your birth Month",1,12);
        switch (month){
            case 2:
                day = SafeInput.getRangedInt(input,"What is your birth day",1,28);
                break;

            case 4,6,9,11:
                day = SafeInput.getRangedInt(input,"What is your birth day",1,30);
                break;
            default:
                day = SafeInput.getRangedInt(input,"What is your birth day",1,31);
                break;


        }
        hours = SafeInput.getRangedInt(input,"What is your birth Hour",1,24);

        minutes = SafeInput.getRangedInt(input,"What is your birth Minutes",1,59);
        System.out.println("You were born on "+month+"/"+day+"/"+year+" at "+hours+":"+minutes);
    }
}