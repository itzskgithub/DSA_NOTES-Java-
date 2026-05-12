public class max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("max is:" + max(arr, 0));
    }
    private static int max(int[] arr, int i){
        if(i == arr.length - 1) return arr[i];

        int max = max(arr, i + 1);

        return Math.max(max, arr[i]);
    }
}
