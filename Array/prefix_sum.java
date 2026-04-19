public class prefix_sum {
    public static int subarraysum(int[] numbers){
        int maxsum = Integer.MIN_VALUE;
        int[] prefix_sum = new int[numbers.length];
        prefix_sum[0] = numbers[0];
        for(int i = 1; i<numbers.length; i++){
            prefix_sum[i] = prefix_sum[i-1] + numbers[i];
        }
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                int currsum = i == 0 ? prefix_sum[j] : prefix_sum[j] - prefix_sum[i - 1];
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
            
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = subarraysum(numbers);
        System.out.println("max sum is:" + sum);
    }
}
