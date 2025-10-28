//Calculate Bonus Based on Salary and Years of Experience.
//
//          :- take the salary and Year info from the User.
//
//Implement Bonus Calculation Logic:
//
//Define the bonus structure based on salary and years of experience.
//
//           :- If years of experience is less than 1 year: No bonus.
//
//        :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//
//           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//
//           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.


package Java_labs5;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bonus1=getBonus(sc);
        System.out.println("Your Bonus is based on year of experience=" +bonus1);
    }
    public static double getBonus(Scanner sc){

        System.out.print("Enter Year of Experience: ");
        if (!sc.hasNextFloat()) {
            System.out.println("Invalid input. Please enter a numeric value for years of experience.");
            sc.next(); // consume the invalid token
            System.exit(0);  // exit or handle as needed
        }
        float years = sc.nextFloat();

        System.out.print("Enter salary: ");
        if (!sc.hasNextFloat()) {
            System.out.println("Invalid input. Please enter a numeric value for salary.");
            sc.next(); // consume invalid token
            System.exit(0);
        }
        float salary = sc.nextFloat();

        double bonus;
        if (years < 1) {
            bonus = 0;
        } else if (years <= 3) {
            bonus = salary * 0.05;
        } else if (years <= 6) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.15;
        }

        return bonus;

    }
}
