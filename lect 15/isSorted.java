;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,8,4,5};
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] < arr[i-1]){
                System.out.println("Array is not sorted");
            }
            else{
                System.out.println("Array is sorted");
            }
        }
        
    }
}
