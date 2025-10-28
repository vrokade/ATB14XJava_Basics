//take the input from the user of Units.
//
//Implement Rate Structure:
//
//Define the rate structure for calculating the bill based on the number of units consumed.
//
//        :-  First 100 units: 0.50Rs per unit
//
//            :-  Next 100 units (101-200): 0.75Rs per unit
//
//            :- Next 100 units (201-300): 1.20Rs per unit
//
//            :- Above 300 units: 1.50Rs per unit



package Java_labs5;

import java.util.Scanner;

public class ElectricBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bill1 = calculateBill(sc);
        System.out.println("Your Electicity Bill is : "+ bill1);

    }
    public static float calculateBill(Scanner sc){
        System.out.println("Enter the unit");
        int unit=0;
        float bill =1.0f;
        if(sc.hasNextInt()){
            unit=sc.nextInt();
            if(unit>=0 && unit<=100){
                bill = unit*0.5f;
            } else if (unit>=101 && unit<=200) {
                bill = 100*0.5f + (unit-100)*0.75f;
                
            } else if (unit>=201 && unit<=300) {
                bill=100*0.5f + 100*0.75f + (unit-200)*1.20f;
            }
            else if (unit>300) {
                bill=100*0.5f + 100*0.75f + 100*1.20f+ (unit-300)*1.50f;

            }
        }
        else {
            System.out.println("Enter a valid Units");
            System.exit(0);
        }
        return bill;
    }

}
