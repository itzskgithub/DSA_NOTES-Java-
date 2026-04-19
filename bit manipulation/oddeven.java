
import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num & 1) == 1) System.out.println("odd");
        else System.out.println("even");
    }
}
