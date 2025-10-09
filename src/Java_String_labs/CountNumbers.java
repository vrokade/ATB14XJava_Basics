package Java_String_labs;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        int count =0;
        for(int i=0; i<=str.length()-1;i++){
            count++;
        }
        System.out.println(count);
    }
}
