import java.util.*;
public class fibbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("nth term is: "+ fibonacci(n));
    }
    static int fibonacci(int n){
        if(n == 1 || n==0){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
