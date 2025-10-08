package Java_labs3;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = readInt(sc,"Enter the marks");

        if (a>=0 && a<60) {
            System.out.println("Grade F");
        } else if (a >= 60 && a <= 69) {
            System.out.println("Grade D");
        } else if (a >= 70 && a <= 79) {
            System.out.println("Grade C");
        } else if (a >= 80 && a <= 89) {
            System.out.println("Grade B");
        } else if (a >= 90 && a <= 100) {
            System.out.println("Grade A");
        }

    }

    static int readInt(Scanner sc, String prompt) {

        System.out.println(prompt);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Please enter your value between 1 - 100");
            System.exit(0);
            return 0;
            }

    }

    }




