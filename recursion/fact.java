
import java.util.*;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("factorial is:" + fact(n));

    }
    static int fact(int n){
        int f = 1;
        if(n == 0){
            return f;
        }
        f = fact(n - 1);
        f = n * f;
        return f;
    }
}
