public class subarray {
    public static void printsubarray(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            int start = i;
            int ts = 0;
            int minsum = Integer.MAX_VALUE;
            int maxsum = Integer.MIN_VALUE;
            int sum = 0;
            for(int j=i; j<numbers.length; j++){
                
                int end = j;

                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                    
                    
                }
                sum = sum + numbers[j];
                if(maxsum<sum){
                    maxsum = sum;
                }
                if(minsum > sum){
                    minsum = sum;
                }
                
                System.out.println();
                ts++;
                
            }
            System.out.println("Total subarray:" + ts);
            System.out.println("max sum :" + maxsum);
            System.out.println("min sum :" + minsum);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2,5,6,1,8};
        printsubarray(numbers);
    }
}
