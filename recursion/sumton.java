import java.util.*;
public class sumton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("sum is:" + sumton(n));

    }
    static int sumton(int n){
        int sum = 0;
        if(n == 1){
            sum = 1;
            return sum;
        }
        sum = sumton(n - 1);
        sum = sum + n;
        return sum;

    }
}
