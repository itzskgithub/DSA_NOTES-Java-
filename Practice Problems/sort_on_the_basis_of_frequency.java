/*
Question: sort a array in the basis of their frequency and if the freq is same then the smallest element will appear first.
    arr = {1,1,1,3,5,5,44,42}
*/

import java.util.*;
public class sort_on_the_basis_of_frequency {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,5,5,44,42};
        HashMap<Integer,Integer> map = new HashMap<>();

        //  Put the values in the map along with their freq
        for(int num : arr){
        map.put(num , map.getOrDefault(num , 0) + 1);
        }

        // Now we will sort the array before that we have to convert the array into Integer[](wrapper class) because in custom sorting we need objects not a ordinary data type

        Integer[] nums = new Integer[arr.length];
        for(int i = 0; i < arr.length; i++){
            nums[i] = arr[i];
        }

        // Now sort the array

        Arrays.sort(nums , new Comparator<Integer>(){
            public int compare(Integer a , Integer b){
                int freqA = map.get(a);
                int freqB = map.get(b);

                if(freqA != freqB){
                    return freqA - freqB;
                }
                return a - b;
            }
        });
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
