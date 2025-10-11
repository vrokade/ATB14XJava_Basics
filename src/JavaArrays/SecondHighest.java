package JavaArrays;

public class SecondHighest {
    public static void main(String[] args) {

        int[] numbers = {12,15,25,67,11,17,99};
        int highest = 0;
        int secondHighest = 0;

        for(int num:numbers){
            if(num>highest){
                secondHighest=highest;
                highest=num;
            } else if (num>secondHighest && num!=highest);

        }
        System.out.println("Secondhighest = "+secondHighest);
        System.out.println("Highest = "+highest);
    }
}
