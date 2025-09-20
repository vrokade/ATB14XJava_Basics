package Java_labs2;

public class Ternary_lab02 {
    public static void main(String[] args) {

        int n1 = 12;
        int n2 = 14;
        int n3 = 11;

        // print max number using Ternary operator

        int result = (n1>n2 && n1>n3)? n1 :((n2>n3 && n2>n1)? n2 :n3) ;
        System.out.println(result);
    }
}
