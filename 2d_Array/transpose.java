public class transpose {
    public static void main(String[] args) {
        int nums[][] = {{1,2,3},
                        {4,5,6}};

        int m = nums.length;
        int n = nums[0].length;

        int transpose[][] = new int[n][m];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                transpose[j][i] = nums[i][j];
            }
        }
        System.out.println("Original matrics :");
        printmatrics(nums);
        System.out.println("Transpose of matrics:");
        printmatrics(transpose);
        
    }

    public static void printmatrics(int[][] nums){
        int m = nums.length;
        int n = nums[0].length;

        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
