package Java_String_labs;

public class SecondMax {
    public static void main(String[] args) {

        // find second max int
        int[] arr = {12, 34, 10, 1, 100, 3, 4, 32};
        int max1=0;
        int max2=0;

        for(int i=0;i<arr.length;i++){
            if(max1<arr[i]){
                max1=arr[i];
            }
        }
        System.out.println("Maximum Number is ="+ max1);

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max1){
                if(max2<arr[i]){
                    max2=arr[i];
                }
            }
        }
        System.out.println("Second max is = "+ max2);

    }
}
