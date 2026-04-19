import java.util.*;

public class target_Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target:");
        int target = sc.nextInt();
        int[] arr = new int[]{1,45,25,10,4};
        Sum_number count = new Sum_number();
        int result = count.no_of_pairs(target, arr, arr.length);

        System.out.println(result);
    }
}

class Sum_number{
    int no_of_pairs(int target, int[] arr, int n){
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                sum = arr[i] + arr[left] + arr[right];
                if(sum == target){
                    count++;
                    left++;
                    right--;
                }
                if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return count;
    }
}