public class mergearrays {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,6};
        int arr2[] = {2,4};

        // the arrays should be merged in such a way that they are sorted overall and the both arrays are also sorted.

        int merged_length = arr1.length + arr2.length;
        int[] merged = new int[merged_length];

        int arr1left = 0;
        int arr2left = 0;

        while(arr1left)
        for(int i = 0; i < merged_length; i++){
            merged[i] = arr1[arr1left] <= arr2[arr2left] ? arr1[arr1left++] : arr2[arr2left++];
        }
        for(int i = 0; i<merged_length; i++){
            System.out.print(merged[i] + " ");
        }
    }
}
