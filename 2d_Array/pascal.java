import java.util.*;
public class pascal {
    private static void createpascal(int numRows){
        int[][] pascaltriangle = new int[numRows][];
        for(int i = 0; i<numRows; i++){
            pascaltriangle[i] = new int[i+1];
            for(int j = 0; j <= i; j++){
                if(j == 0 || j== i){
                    pascaltriangle[i][j] = 1;
                }else{
                    pascaltriangle[i][j] = pascaltriangle[i-1][j] + pascaltriangle[i-1][j-1];
                }
                System.out.print(pascaltriangle[i][j] + " ");
            }
                
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        createpascal(number);
    }
}
