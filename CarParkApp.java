package CarParkApp;

import java.util.Scanner;

public class Vehicle {

    public static void main(String[] args) {
        int number = 0;
        int remove_number;
        String Vehicle_Number[] = new String[25];

        while (number != 4) {
			Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to Laksiri Car Park");
            System.out.println("[1] Enter New Vehicle");
            System.out.println("[2] Remove Exiting Vehicle");
            System.out.println("[3] Search & Print Summary");
            System.out.println("[4] Exit");
	    System.out.println("Enter [quit] to main menu");
       
            number = scan.nextInt();

            if (number == 1) {

                for (int i = 0; i < 25; i++) {
                    System.out.println("Please Enter Your Vehicle Number:");
                    Vehicle_Number[i] = scan.next();
                    if (Vehicle_Number[i].toLowerCase().matches("quit")) {
                        Vehicle_Number[i] = null;
                        break;
                    } else {
                        System.out.println("Vehicle Number Submitted!");
                        System.out.println("Your vehicle ID is :" + i);
                    }


                }
                //scan.close();
                
            } else if (number == 3) {
                System.out.println("Summary of Current Vehicles in Park :");
                for (int i = 0; i < 25; i++) {
                    if (Vehicle_Number[i] == null)
                        System.out.println("Parking Slot " + i + " : none");
                    else
                        System.out.println("Parking Slot " + i + " : " + Vehicle_Number[i]);
                }
                
                
                
            } else if (number == 2) {
                Scanner scan2 = new Scanner(System.in);
                System.out.print("Enter Vehicle ID Would You Like to Delete :");
                remove_number = scan2.nextInt();
                Vehicle_Number[remove_number] = null;
                System.out.println("after deletion : ");
                for (int i = 0; i < 25; i++) {
                    if (Vehicle_Number[i] == null)
                        System.out.println("Parking Slot: " + i + " : none");
                    else
                        System.out.println("Parking Slot: " + i + " : " + Vehicle_Number[i]);
                }


            } else
                continue;
        }
    }

}