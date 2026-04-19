public class Binary {
    public static int binarySearch(int numbers[], int key){
        int start = 0; 
        int end = numbers.length - 1;


        while(start <= end){
            int mid = (start + end) / 2;
            if(numbers[mid]  == key){
                return mid;
            }
            if(numbers[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {2,3,4,5,6,7,8,9,12,13,15,16,18,20};
        int key = 12;
        
        int index = binarySearch(numbers, key);

        if(index == -1){
            System.out.println("Key donen't exist");
        }
        else{
            System.out.println("index is: "+index);
        }
    }
}
