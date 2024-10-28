class CtoFTableDisplay{
    public static double CtoF(double c){
        return ((1.8)*c)+32;
    }
    public static void main(String[] args){
        System.out.printf("%-10s %-10s%n","Celsius","Fahrenheit");
        System.out.print("-".repeat(10)+"\n");
        for(int i = -100; i<=100;i++){
            System.out.printf("%-10d || %10.2f%n",i,CtoF(i));
        }
    }
}