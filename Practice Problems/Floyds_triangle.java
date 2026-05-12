import java.util.*;

class Floyds_triangle{
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int var = 1;
        int[][] main_arr = new int[input][];

        for(int i = 0; i < input; i++){
            int[] arr = new int[i + 1];
            main_arr[i] = arr;
            for(int j = 0; j <= i; j++){
                arr[j] = var;
                var++;
            }
        }
        for(int i = 0; i < main_arr.length; i++){
            for(int j = 0; j < main_arr[i].length; j++){
                System.out.print(main_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}