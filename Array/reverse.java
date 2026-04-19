import java.util.*;
public class reverse {
    public static int[] reverseArray(int[] numbers){
        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("array:" + Arrays.toString(numbers));
        int reversed_array[] = reverseArray(numbers);
        System.out.println("reversed array:" + Arrays.toString(reversed_array));
    }
}
