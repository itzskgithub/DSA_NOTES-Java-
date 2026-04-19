import java.util.*;
public class prefix_Sum_in_range {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter array Elements:");
        for(int i = 1; i <= 5; i++){
        arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: " + Arrays.toString(arr));
        int[] prefixSum =  makePrefixSum(arr);
        
        System.out.println("Enter no. of quarries");
        int quarries = sc.nextInt();
        while(quarries-- > 0){
            System.out.println("Enter range:" );
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = prefixSum[r] - prefixSum[l - 1];
            System.out.println("Result: " + sum);
        }
        
        
        
        
        
    }

    static int[] makePrefixSum(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}
