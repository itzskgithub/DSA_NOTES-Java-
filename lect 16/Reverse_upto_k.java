import java.util.*;
public class Reverse_upto_k{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k:" );
        int k = sc.nextInt();
        int[] arr = new int[]{1,2,3,4,5};
        int n = arr.length;
        
        k = k % n;

        reverse Ans = new reverse();

        Ans.reverse_arr(arr,0,n - 1);

        Ans.reverse_arr(arr,0,k - 1);

        Ans.reverse_arr(arr,k,n - 1);

        String str = Arrays.toString(arr);
        System.out.print("Reversed_array:");
        System.out.println(Arrays.toString(arr));

    }

    static class reverse{
        void reverse_arr(int[] arr, int left,int right){
            
            int temp = 0;

            while(left < right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}

