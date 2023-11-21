import java.util.Scanner;

public class Garage {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of hours or enter -1 to quit");
        double numberOfHours = input.nextDouble();

        double totalCharges;

        while (numberOfHours != -1){
            System.out.println("customer charges: $"+calculateCharges(numberOfHours));
            System.out.println("Enter the number of hours or enter -1 to quit");
            numberOfHours = input.nextDouble();
        }
    }

    public static double calculateCharges(double numberOfHours){
        double minimumFee = 2.0;
        double totalCharges=0;

        if(numberOfHours <= 3){
            totalCharges =  2;
        }
        if(numberOfHours >3 && numberOfHours < 24 ){
            totalCharges = minimumFee + Math.ceil((numberOfHours -3)*0.5);
        }

        if(numberOfHours >=24){
            totalCharges = 10;
        }

        return totalCharges;
    }
}
