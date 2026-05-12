public class isSorted {
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,7};

        if(check(arr,0)){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
    private static boolean check(int[] arr, int i){
        if(i == arr.length - 1) return true;

        return arr[i] <= arr[i + 1] && check(arr, i + 1);



    }
}
