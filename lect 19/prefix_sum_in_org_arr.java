import java.util.*;

public class prefix_sum_in_org_arr {
    public static void main(String[] args) {

        int[] arr = new int[]{1,25,12,14,10};
        int n = arr.length;
        
        //In prefix sum
        //arr[1] = arr[1] + arr[0]
        //arr[2] = arr[2] + arr[1]
        //arr[i] = arr[i] + arr[i - 1]
        
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i - 1];
        }

        System.out.println("Prefix Array" + Arrays.toString(arr));
    }
}
