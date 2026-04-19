import java.util.*;

public class laegest_smallest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,8,10,7};
        int[] temp = new int[2];
        int largest = 0;
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        temp[0] = smallest;
        temp[1] = largest;
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }
}
