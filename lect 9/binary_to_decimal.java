import java.util.*;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int pow = 1;
        int ans = 0;
        while(decimal > 0){
            ans = ans + (decimal % 10) * pow;
            pow *= 2;
            decimal /= 10;
        }
        System.out.println(ans);
    }
}
