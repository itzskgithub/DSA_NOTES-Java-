import java.util.*;
public class count_duplicates {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1,1,2,2,4};
        for(int i = 0; i < 5; i++){
            map.put(arr[i] , map.getOrDefault(arr[i],0) + 1);
        }

        int duplicates = 0;
        for(int value : map.values()){
            if(value > 1){
                duplicates++;
            }
        }
        System.out.println("Duplicates:" + duplicates);
    }
}
