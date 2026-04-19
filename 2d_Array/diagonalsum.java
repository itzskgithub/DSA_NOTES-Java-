

public class diagonalsum {
    public static void main(String[] args) {
        int nums[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(i == j || i + j == nums.length - 1){
                    sum += nums[i][j];
                }
                
            }
        }
        System.out.println(sum);
    }
}



// this problem also can be solved by a optimised approach the key concept is if i == j or i + j == nums.length - 1 so it also can be written as i == n-1-j or j == n-1-i; so the optimised code is:

// public class diagonalsum{
//     public static void main(String[] args) {
//         int nums[][] = {{1,2,3,4},
//                         {5,6,7,8},
//                          {9,10,11,12},
//                          {13,14,15,16}};

//         int sum = 0;
//         int n = nums.length;
//         for(int i = 0; i<nums.length; i++){
//             sum += nums[i][i];
//            if(i != n-i-1){in the case of odd matrics}
//             sum += nums[i][n-1-i];
//         }
//         System.out.println(sum);
//     }
// }