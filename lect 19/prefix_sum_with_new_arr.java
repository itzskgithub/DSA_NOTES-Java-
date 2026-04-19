
import java.util.*;
public class prefix_sum_with_new_arr {
    public static void main(String[] args) {
        int[] arr = new int[]{2,6,10,7,12};
        int n = arr.length;
        int[] prefix = new int[n];
        
        //prefix[i] = prefix[i - 1] + arr[i]
        //prefix[0] = arr[0]

        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] =  prefix[i - 1] + arr[i];
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Prefix Array: " + Arrays.toString(prefix));
    }
}
