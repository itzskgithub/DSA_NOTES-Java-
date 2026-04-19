public class maxsum_of_subarray {
    public static int sumsubarray(int[] numbers){
        int maxsum = Integer.MIN_VALUE;
        
        for(int i=0; i<numbers.length; i++){
            int currsum = 0;
            for(int j=i; j<numbers.length; j++){
               currsum += numbers[j];
               if(maxsum < currsum){
                    maxsum = currsum;
               }
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = sumsubarray(numbers);
        System.out.println("maxsum:" + sum);
    }
}
