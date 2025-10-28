package Java_labs4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //check the number is palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc. nextInt();

        if(num==isPalindrome(num)){
            System.out.println("It is a palindrome number");
        }
        else {
            System.out.println("Not Palindrome");
        }


    }
    public static int isPalindrome(int num){
        int reverse=0;
        while(num!=0){
            reverse = reverse*10+num%10;
            num=num/10;
        }
        return reverse;
    }

}
