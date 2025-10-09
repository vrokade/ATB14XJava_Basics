package Java_String_labs;

import java.util.Scanner;

public class FirstLetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        String[] splitstr = str.split(" ");


        for(int i=0;i<=splitstr.length-1;i++){
            System.out.print(splitstr[i].charAt(0));
        }
    }
}
