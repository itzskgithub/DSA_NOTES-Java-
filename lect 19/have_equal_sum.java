import java.util.*;
public class have_equal_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr  = new int[6];

        boolean isfalse = false;

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        int Sum[] = prefixSum(arr);
        for(int i = arr.length - 1; i>= 1; i--){
            if(Sum[arr.length - 1] - Sum[i - 1] == Sum[i - 1]){
                isfalse = true;
                break;
            }
        }
        System.out.println(isfalse);
    }
        
    static int[] prefixSum(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }
}
