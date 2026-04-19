public class Linear {
    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i<=numbers.length; i++){
            if(numbers[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5,4,7,12,10,45,14,21,42,13};
        int key = 12;

        int index = linearSearch(numbers, key);

        if(index == -1){
            System.out.println("key not available");
        }
        else{
            System.out.println("Index is: " + index);
        }
    }
}
