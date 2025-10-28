package Java_labs4;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        // check number is armstrong
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();

        if(IsArmstrongNumber(num))
            System.out.println("Armstrong number");
        else System.out.println("Not a armstrong number");
    }

    public static boolean IsArmstrongNumber(int num)
    {
        int sum=0;
        int temp=num;
        int order=powerOrder(num);
        while(temp!=0)
        {
            sum=sum+ (int)Math.pow(temp%10,order);
            temp=temp/10;
        }
        //  System.out.println(sum);
        return (num==sum) ;
    }

    public static int powerOrder(int num)
    {
        int c=0;
        while(num!=0)
        {
            num=num/10;
            c++;
        }
        return c;

    }
}
