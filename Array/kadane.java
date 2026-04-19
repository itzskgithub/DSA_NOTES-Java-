public class kadane {
    public static void kadane(int[] numbers){
        int ms= Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }

        System.out.println("Max sum is:" + ms);
    }
    public static void main(String[] args) {
        int[] numbers = {-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
}

//this algorithm can't handle the case where all the elements are negative then it will give the output 0 but that is not the correct answer. so , for handling that case we have to write a another case for handling this situation.

//for handling that the code is as follows:

//int ms = numbers[0];
//int cs = numbers[0];
/*for(int i = 1; i<numbers.length; i++){
    cs = Math.max(numbers[i] , cs + numbers[i])
    ms = Math.max(cs,ms);
}
*/