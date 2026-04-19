import java.util.*;
public class sort_two_pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{0,0,1,0,1,1,0,1,0,1,1};
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                int temp =0;
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[right] == 1 && arr[left] == 1){
                right--;
            }
            if(arr[right] == 0 && arr[left] == 0){
                left++;
            }
            left++;
            right--;
        }
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
}
