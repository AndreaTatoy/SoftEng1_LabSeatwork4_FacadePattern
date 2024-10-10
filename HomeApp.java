import java.util.Scanner;

public class HomeApp{
    public static void main(String[] args){
        HomeInterface homeInterface = new HomeInterface();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter (1) to turn on all appliances."
                + "\nEnter (0) to turn off all appliances.");
        int choice = scan.nextInt();

        if (choice == 1){
            homeInterface.turnOnAll();
        }

        else if (choice == 0){
            homeInterface.turnOffAll();
        }

        else {
            System.out.println("ERROR");
        }
    }
}