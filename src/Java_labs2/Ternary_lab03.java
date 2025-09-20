package Java_labs2;

public class Ternary_lab03 {
    public static void main(String[] args) {

        int age = 40;

        String result = (age>=01 && age <18)? "Minor age" :(age>30 && age<60 ? "Adult" : "Senior Citizen");
        System.out.println(result);
    }
}
