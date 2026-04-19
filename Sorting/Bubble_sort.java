/*
Bubble sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.
With each pass, the largest element moves to the end, like a bubble rising to the top.
*/

   

public class Bubble_sort {
    public static void bubblesort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,2,4,3};
        System.out.print("Unsorted array:");
        print(arr);
        System.out.println();
        bubblesort(arr);
        System.out.print("Sorted array:");
        print(arr);
    }
}
