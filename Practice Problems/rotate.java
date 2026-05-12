public class rotate{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8}};
        int[][] rotate = new int[4][2];
       
        int row = arr.length;
        int col = arr[0].length;
        

        //Now transpose

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                rotate[j][row - 1 - i] = arr[i][j];
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j< 2; j++){
                System.out.print(rotate[i][j] + " ");
            }
            System.out.println();
        }
    }
}