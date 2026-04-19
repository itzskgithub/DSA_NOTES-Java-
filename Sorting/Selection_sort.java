/* 
Selection sort : In this sorting technique we find the smallest element in the array and swap it with the first place and repeat the same process until the whole array is sorted
*/

public class Selection_sort {

    public static void selection_sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void print(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        System.out.print("Unsorted Array : ");
        print(arr);
        selection_sort(arr);
        System.out.println();
        System.out.print("sorted array: ");
        print(arr);
    }
}
