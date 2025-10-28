
//    Take the below User info and store it into the variables:
//
//    Age (integer)
//
//    Salary (double or float)
//
//    Credit Score (integer)

//    Age Validation:
//
//            :- Check if the age is a positive integer.
//
//            :- Ensure the age is at least 18 years old.
//
//            :- Max age can be 80.
//
//
//
//    Salary Validation:
//
//            :- Check if the salary is a positive number.
//
//            :- Define a minimum salary threshold (e.g., 30,000).
//
//    Credit Score Validation:
//
//            :- Check if the credit score is a positive integer.
//
//             :- Define a minimum credit score threshold (e.g., 650).
//
//            :- Max credit score threshold (e.g., 850).

package Java_labs5;

import java.util.Scanner;

public class LoanEligibilityChecks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = getValidAge(sc);
        float salary1 = getValidSalary(sc);
        int credit1=getValidCreditScore(sc);
        System.out.println("Loan Approved");

    }
    public static int getValidAge(Scanner sc){
        System.out.println("Enter the age");
        int age=0;
        if(sc.hasNextInt()) {
            age = sc.nextInt();
            if (age < 0) {
                System.out.println("Age cannot be 0 or negative");
                System.exit(1);
            } else if (age < 18) {
                System.out.println("Person is too young to get loan");
                System.exit(1);
            } else if (age > 80) {
                System.out.println("Person is too old to get loan");
                System.exit(1);
            }
        }

        else {
            System.out.println("you are eligible for loan");
            System.exit(1);
        }
        return age;
    }

    public static float getValidSalary(Scanner sc){
        System.out.println("Enter a Salary");
        float salary=0;
        if(sc.hasNextFloat()) {
            salary = sc.nextFloat();
            if (salary < 0) {
                System.out.println("Salary should be in Positive Number");
                System.exit(1);
            } else if (salary < 30000) {
                System.out.println("Salary is too low to get the loan");
                System.exit(1);
            }
        }
        else {
            System.out.println("You are Eligible for loan");
        }
        return salary;
    }

    public static int getValidCreditScore(Scanner sc){
        System.out.println("Enter a Credit Score");
        int credit = 0;
        if(sc.hasNextInt()){
            credit=sc.nextInt();
            if(credit<0 || credit>850){
                System.out.println("Enter a valid Credit Score");
                System.exit(1);
            } else if (credit<650) {
                System.out.println("Credit Score is too low to get loan");
                System.exit(1);
            }
        }
        else {
            System.out.println("You are eligible for loan");
        }
        return credit;
    }

}
