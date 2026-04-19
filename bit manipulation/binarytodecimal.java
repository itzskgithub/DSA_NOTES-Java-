import java.util.*;
public class binarytodecimal {
    public static int todecimal(String binary){
        int sum = 0;
        int p = 0;
        for(int i = binary.length() - 1; i >= 0; i--){
            sum += (binary.charAt(i) - '0') * (int)Math.pow(2,p);
            p++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number:");
        String binary = sc.nextLine();
        int decimal = todecimal(binary);
        System.out.print("decimal value is:" + decimal);
    }
}
