package Java_String_labs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();


        //with using inbuilt fun

//        StringBuilder sb = new StringBuilder("Vishal");
//        sb.reverse();
//        System.out.println(sb);  //lahsiV

        // without using inbuilt fun

        String rev = "";

        for(int i=st.length()-1; i>=0; i--){
            rev+=st.charAt(i);
        }
        System.out.println("Reverse string =" +rev);


    }
}
