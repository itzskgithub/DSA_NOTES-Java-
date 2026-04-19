import java.util.*;
public class matrix_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        System.out.println("Enter ist array elements:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 2nd array Elements");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[2][2];
        result = Array_Sum(arr1,arr2);
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
    
    static int[][] Array_Sum(int[][] arr1, int[][] arr2){
        int[][] sum = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                sum[i][j] = arr1[i][j] +  arr2[i][j];
                  
            }
            System.out.println("");
        }
        return sum;
    }
}
